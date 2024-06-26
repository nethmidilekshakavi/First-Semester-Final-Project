package lk.ijse.Dao.Custom;

import lk.ijse.Model.CustomerModel;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDao {

    ArrayList<CustomerModel> AllCustomer() throws SQLException;

    boolean SaveCustomer(CustomerModel customerModel) throws SQLException;

    boolean UpdateCustomer(CustomerModel customerModel) throws SQLException;

    boolean DeleteCustomer(String id) throws SQLException;


    ArrayList<String> allcustomerNumber() throws SQLException;


    ArrayList<CustomerModel>SearchCID(String cid) throws SQLException;

    ArrayList<String> loadAllCustomerID() throws SQLException;
}

