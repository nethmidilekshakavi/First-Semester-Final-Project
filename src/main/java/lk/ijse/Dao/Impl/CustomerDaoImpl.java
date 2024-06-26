package lk.ijse.Dao.Impl;

import lk.ijse.DB.DbConnection;
import lk.ijse.Dao.Custom.CustomerDao;
import lk.ijse.Model.CustomerModel;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public ArrayList<CustomerModel> AllCustomer() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement("select * from Customer");
        ResultSet resultSet =preparedStatement.executeQuery();

        ArrayList<CustomerModel>arrayList = new ArrayList<>();

        while (resultSet.next()){
            arrayList.add(new CustomerModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6),resultSet.getString(7)));
        }
        return arrayList;
    }
@Override
    public boolean SaveCustomer(CustomerModel customerModel) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement ptsm = connection.prepareStatement("INSERT INTO Customer VALUES(?, ?, ?, ?,?,?,?)");

        ptsm.setString(1, customerModel.getC_ID());
        ptsm.setString(2, customerModel.getNIC());
        ptsm.setString(3, customerModel.getFirst_Name());
        ptsm.setString(4, customerModel.getLast_Name());
        ptsm.setString(5, customerModel.getAddress());
        ptsm.setInt(6, customerModel.getPhone_Number());
        ptsm.setString(7, customerModel.getEmail());

        return ptsm.executeUpdate() > 0;

    }
    @Override
    public boolean UpdateCustomer(CustomerModel customerModel) throws SQLException {
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
    }
@Override
    public boolean DeleteCustomer(String id) throws SQLException {
        Connection connection= DbConnection.getInstance().getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("delete from Customer where C_ID=?");
        preparedStatement.setString(1,id);
        int i;
        i=preparedStatement.executeUpdate();
        return i > 0;
    }
@Override
    public ArrayList<String> allcustomerNumber() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT Phone_Number FROM Customer");

        ArrayList<String> allid = new ArrayList<>();
        while (rst.next()){

            allid.add(rst.getString(1));
        }
        return allid;
    }
@Override
    public ArrayList<CustomerModel>SearchCID(String cid) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Customer WHERE C_ID = ?");
        preparedStatement.setString(1,cid);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.getString(cid);


    return null;
}
@Override
public ArrayList<String> loadAllCustomerID() throws SQLException {
    Connection connection = DbConnection.getInstance().getConnection();
    Statement stm = connection.createStatement();
    ResultSet rst = stm.executeQuery("SELECT * FROM Customer WHERE Phone_Number = ?");

    ArrayList<String> allid = new ArrayList<>();
    while (rst.next()){

        allid.add(rst.getString(6));
    }
    return allid;

    }

}


