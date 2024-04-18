package lk.ijse.Repository;

import lk.ijse.DB.DbConnetion;
import lk.ijse.Model.CustomerModel;
import lk.ijse.controller.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {



    public static boolean savecustomer(CustomerModel customerModel) throws SQLException {
        String sql = "INSERT INTO Customer VALUES(?, ?, ?, ?,?,?,?)";

        Connection connection = DbConnetion.getInstance().getConnection();
        PreparedStatement ptsm = connection.prepareStatement(sql);

        ptsm.setString(1,customerModel.getC_ID());
        ptsm.setString(2, customerModel.getNIC());
        ptsm.setString(3, customerModel.getFirst_Name());
        ptsm.setString(4, customerModel.getLast_Name());
        ptsm.setString(5, customerModel.getAddress());
        ptsm.setInt(6,customerModel.getPhone_Number());
        ptsm.setString(7, customerModel.getEmail());


        return ptsm.executeUpdate() > 0;
    }


    public static boolean updateCustomer(CustomerModel customerModel) throws SQLException {
        String sql = "UPDATE customers SET NIC = ?, FirstName = ?, LastName = ?, Address = ? ,PhoneNumber = ? ,Email = ? WHERE id = ?";

        Connection connection = DbConnetion.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, customerModel.getNIC());
        pstm.setString(2, customerModel.getFirst_Name());
        pstm.setString(3, customerModel.getLast_Name());
        pstm.setString(4, customerModel.getAddress());
        pstm.setInt(5,customerModel.getPhone_Number());
        pstm.setString(6, customerModel.getEmail());
        pstm.setString(7,customerModel.getC_ID());

        return pstm.executeUpdate() > 0;
    }

    public static boolean delete(String id) throws SQLException {
            try{
                Connection connection=DbConnetion.getInstance().getConnection();
                PreparedStatement preparedStatement=connection.prepareStatement("delete from customer where CID=?");
                preparedStatement.setString(1,id);
                int i;
                i=preparedStatement.executeUpdate();
                return i>0;
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        }

    public static CustomerModel searchById(String id) throws SQLException {
        String sql = "SELECT * FROM customers WHERE id = ?";

        Connection connection = DbConnetion.getInstance().getConnection();
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

    public static List<Customer> getAll() throws SQLException {
        String sql = "SELECT * FROM customers";

        PreparedStatement pstm = DbConnetion.getInstance().getConnection()
                .prepareStatement(sql);

        ResultSet resultSet = pstm.executeQuery();

        List<Customer> cusList = new ArrayList<>();

        while (resultSet.next()) {
            String cid = resultSet.getString(1);
            String nic = resultSet.getString(2);
            String FName = resultSet.getString(3);
            String LName = resultSet.getString(4);
            String Address = resultSet.getString(5);
            int PNumber = resultSet.getInt(6);
            String email = resultSet.getString(7);

            CustomerModel customerModel= new CustomerModel (cid,nic,FName,LName,Address,PNumber,email);
            cusList.add(customerModel);
        }
        return cusList;
    }

    public static List<String> getIds() throws SQLException {
        String sql = "SELECT id FROM customers";
        PreparedStatement pstm = DbConnetion.getInstance().getConnection()
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








