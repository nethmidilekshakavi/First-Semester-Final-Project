package lk.ijse.Repository;

import lk.ijse.DB.DbConnetion;
import lk.ijse.Model.CustomerModel;
import lk.ijse.controller.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepo {

    public static boolean saveCustomer(CustomerModel customer) throws SQLException {
        String sql = "INSERT INTO Customer VALUES(?, ?, ?, ?,?,?)";

        Connection connection = DbConnetion.getInstance().getConnection();
        PreparedStatement ptsm = connection.prepareStatement(sql);

        ptsm.setObject(1, CustomerModel.getC_ID());
        ptsm.setObject(2, CustomerModel.getFirst_Name());
        ptsm.setObject(3, CustomerModel.getLast_Name());
        ptsm.setObject(4, CustomerModel.getAddress());
        ptsm.setObject(5, CustomerModel.getPhone_Number());
        ptsm.setObject(6, CustomerModel.getEmail());

        return ptsm.executeUpdate() > 0;
    }


    public static boolean updateCustomer(Customer customer) throws SQLException {
        String sql = "UPDATE customers SET FirstName = ?, LastName = ?, Address = ? ,PhoneNumber = ? ,Email = ? WHERE id = ?";

        Connection connection = DbConnetion.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, CustomerModel.getFirst_Name());
        pstm.setObject(2, CustomerModel.getLast_Name());
        pstm.setObject(3, CustomerModel.getAddress());
        pstm.setObject(4, CustomerModel.getPhone_Number());
        pstm.setObject(5, CustomerModel.getEmail());
        pstm.setObject(6, CustomerModel.getC_ID());

        return pstm.executeUpdate() > 0;
    }

    public static boolean delete(String id) throws SQLException {
        String sql = "DELETE FROM customers WHERE id = ?";

        Connection connection = DbConnetion.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, id);

        return pstm.executeUpdate() > 0;
    }

}
