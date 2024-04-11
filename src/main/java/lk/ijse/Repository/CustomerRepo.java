package lk.ijse.Repository;

import lk.ijse.DB.DbConnetion;
import lk.ijse.Model.CustomerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepo {
    public static boolean saveCustomer(CustomerModel customerModel){
        try {
           Connection connection = DbConnetion.getInstance.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into customer values (?,?,?,?,?,?)");
            preparedStatement.setString(1,customerModel.getC_ID());
            preparedStatement.setString(2,customerModel.getFirst_Name());
            preparedStatement.setString(3,customerModel.getLast_Name());
            preparedStatement.setString(4,customerModel.getAddress());
            preparedStatement.setInt(5,customerModel.getPhone_Number());
            preparedStatement.setString(6,customerModel.getEmail());

            int i;
            i=preparedStatement.executeUpdate();
            return i>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
return false;
    }
}
