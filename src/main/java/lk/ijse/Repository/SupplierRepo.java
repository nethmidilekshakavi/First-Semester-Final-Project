package lk.ijse.Repository;

import lk.ijse.DB.DbConnection;
import lk.ijse.Model.SupplierModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierRepo {

    public static boolean saveSupplier(SupplierModel supplierModel) throws SQLException {
       try {
           Connection connection = DbConnection.getInstance().getConnection();
              PreparedStatement ptsm = connection.prepareStatement("INSERT INTO Supplier VALUES(?, ?, ?, ?,?,?,?,?,?,?,?)");

           ptsm.setString(1, supplierModel.getS_ID());
           ptsm.setString(2, supplierModel.getName());
           ptsm.setString(3, supplierModel.getAddress());
           ptsm.setInt(4, supplierModel.getPhone_Number());
           ptsm.setString(5, supplierModel.getIngredient());
           ptsm.setString(6, supplierModel.getDate_Of_Purchase());
           ptsm.setString(7, supplierModel.getAmount_due());
           ptsm.setString(8, supplierModel.getDate_of_Payment());
           ptsm.setString(9, supplierModel.getPayment_Type());
           ptsm.setString(10, supplierModel.getAmount_Paid());
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }

          return false;
    }

        public  static  boolean updateSupplier(SupplierModel supplierModel) throws SQLException {
        String sql = "UPDATE Supplier SET Name = ?, Address = ?, Phone_Number = ?, Ingredient =?, Date_Of_Purchase=? , Amount_due = ?, Date_of_Payment = ?, Payment_Type =?, Amount_Paid= ? WHERE S_ID = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement ptsm = connection.prepareStatement(sql);

        ptsm.setString(1,supplierModel.getName());
        ptsm.setString(2,supplierModel.getAddress());
        ptsm.setInt(3,supplierModel.getPhone_Number());
        ptsm.setString(4,supplierModel.getIngredient());
        ptsm.setString(5,supplierModel.getDate_Of_Purchase());
        ptsm.setString(6,supplierModel.getAmount_due());
        ptsm.setString(7,supplierModel.getDate_of_Payment());
        ptsm.setString(8,supplierModel.getPayment_Type());
        ptsm.setString(9,supplierModel.getAmount_Paid());
        ptsm.setString(10,supplierModel.getS_ID());

        return ptsm.executeUpdate() > 0;

    }

    public static boolean Delete(String sid){
        try {
            Connection connection =DbConnection.getInstance().getConnection();
            PreparedStatement ptsm = connection.prepareStatement("delete from Supplier where S_ID = ?");
            ptsm.setString(1,sid);
            int i;
            i = ptsm.executeUpdate();
            return i > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static SupplierModel searchById(String id) throws SQLException {
        String sql = "SELECT * FROM Supplier WHERE id = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            String S_ID = resultSet.getString(1);
            String Name = resultSet.getString(2);
            String Address = resultSet.getString(3);
            int PhoneNumber = resultSet.getInt(4);
            String Ingredient = resultSet.getString(5);
            String DOPurchase = resultSet.getString(6);
            String amountDue = resultSet.getString(7);
            String DOPayment = resultSet.getString(8);
            String paymentType = resultSet.getString(9);
            String AmountPaid = resultSet.getString(10);

            SupplierModel supplierModel= new SupplierModel(S_ID,Name,Address,PhoneNumber,Ingredient,DOPurchase,amountDue,DOPayment,paymentType,AmountPaid);

            return supplierModel;
        }

        return null;
    }

    public static ArrayList<SupplierModel> getAll() throws SQLException {
        ArrayList<SupplierModel>supplierModels =new ArrayList<>();
        try{
            Connection connection =DbConnection.getInstance().getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement("select * from Supplier");
            ResultSet resultSet =preparedStatement.executeQuery();

            while (resultSet.next()){
                SupplierModel supplierModel =new SupplierModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10));
                supplierModels.add(supplierModel);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return supplierModels;
    }

    public static List<String> getIds() throws SQLException {
        String sql = "SELECT S_ID FROM Supplier";
        PreparedStatement pstm = DbConnection.getInstance().getConnection()
                .prepareStatement(sql);

        List<String> idList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            idList.add(id);
        }
        return idList;
    }

}
