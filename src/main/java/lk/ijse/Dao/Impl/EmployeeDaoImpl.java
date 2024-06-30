package lk.ijse.Dao.Impl;

import lk.ijse.Dao.Custom.EmployeeDao;
import lk.ijse.Dao.SQLUtil;
import lk.ijse.Entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao {
   @Override
    public ArrayList<Employee> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Employee> allemployee = new ArrayList<>();
        ResultSet resultSet = SQLUtil.execute("select * from Employee");
        while (resultSet.next()) {
            Employee employee = new Employee(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getInt(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getInt(10),resultSet.getInt(11),resultSet.getInt(12));
            allemployee.add(employee);
        }
        return allemployee;
    }

    @Override
    public boolean save(Employee entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Employee entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public Employee search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

}
