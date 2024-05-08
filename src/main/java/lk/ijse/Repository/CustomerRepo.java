package lk.ijse.Repository;

import lk.ijse.DB.DbConnection;
import lk.ijse.Model.CustomerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {

    public static boolean savecustomer(CustomerModel customerModel) throws SQLException {
        try {
    Connection connection = DbConnection.getInstance().getConnection();
    PreparedStatement ptsm = connection.prepareStatement("INSERT INTO Customer VALUES(?, ?, ?, ?,?,?,?)");

    ptsm.setString(1, customerModel.getC_ID());
    ptsm.setString(2, customerModel.getNIC());
    ptsm.setString(3, customerModel.getFirst_Name());
    ptsm.setString(4, customerModel.getLast_Name());
    ptsm.setString(5, customerModel.getAddress());
    ptsm.setInt(6, customerModel.getPhone_Number());
    ptsm.setString(7, customerModel.getEmail());

        int i;
        i=ptsm.executeUpdate();
        return i > 0;
    }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public static CustomerModel searchByContact(String contact) throws SQLException {
        String sql = "SELECT * FROM Customer WHERE Phone_Number = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, contact);

        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            String C_ID = resultSet.getString(1);
            String NIC = resultSet.getString(2);
            String First_Name = resultSet.getString(3);
            String Last_Name = resultSet.getString(4);
            String Address = resultSet.getString(5);
            int Phone_Number = resultSet.getInt(6);
            String Email = resultSet.getString(7);

            CustomerModel customerModel = new CustomerModel(C_ID, NIC, First_Name, Last_Name, Address, Phone_Number, Email);

            return customerModel;
        }

        return null;
    }


    public static boolean updateCustomer(CustomerModel customerModel)  {

try {
    Connection connection = DbConnection.getInstance().getConnection();
    PreparedStatement pstm = connection.prepareStatement("UPDATE Customer SET NIC = ?, First_Name = ?, Last_Name = ?, Address = ?  , Email = ?, Phone_Number = ?  WHERE C_ID = ?");
    pstm.setString(1, customerModel.getNIC());
    pstm.setString(2, customerModel.getFirst_Name());
    pstm.setString(3, customerModel.getLast_Name());
    pstm.setString(4, customerModel.getAddress());
    pstm.setString(5, customerModel.getEmail());

    pstm.setInt(6, customerModel.getPhone_Number());
    pstm.setString(7, customerModel.getC_ID());
    return pstm.executeUpdate() > 0;
}catch (SQLException e){
    e.printStackTrace();
}
        return false;
    }

    public static boolean delete(String id) throws SQLException {
            try{
                Connection connection= DbConnection.getInstance().getConnection();
                PreparedStatement preparedStatement=connection.prepareStatement("delete from Customer where C_ID=?");
                preparedStatement.setString(1,id);
                int i;
                i=preparedStatement.executeUpdate();
                return i > 0;
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        }

    public static CustomerModel searchById(String id) throws SQLException {
        String sql = "SELECT * FROM Customer WHERE C_ID = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            String C_ID = resultSet.getString(1);
            String NIC = resultSet.getString(2);
            String First_Name = resultSet.getString(3);
            String Last_Name = resultSet.getString(4);
            String Address = resultSet.getString(5);
            int Phone_Number = resultSet.getInt(6);
            String Email = resultSet.getString(7);

            CustomerModel customerModel = new CustomerModel(C_ID, NIC, First_Name, Last_Name, Address, Phone_Number, Email);

            return customerModel;
        }

        return null;
    }

    public static ArrayList<CustomerModel> getAll() throws SQLException {
       ArrayList<CustomerModel>customerModels =new ArrayList<>();
       try{
           Connection connection =DbConnection.getInstance().getConnection();
           PreparedStatement preparedStatement =connection.prepareStatement("select * from Customer");
           ResultSet resultSet =preparedStatement.executeQuery();

           while (resultSet.next()){
               CustomerModel customerModel =new CustomerModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6),resultSet.getString(7));
                customerModels.add(customerModel);
           }
       } catch (SQLException ex) {
           throw new RuntimeException(ex);
       }
       return customerModels;
    }


    public static List<String> getIds() throws SQLException {
        String sql = "SELECT C_ID FROM Customer";
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








