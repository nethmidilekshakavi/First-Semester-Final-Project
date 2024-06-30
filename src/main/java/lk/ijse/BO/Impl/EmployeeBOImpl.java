package lk.ijse.BO.Impl;

import lk.ijse.BO.Custom.EmployeeBO;
import lk.ijse.Dao.Custom.EmployeeDao;
import lk.ijse.Dao.DaoFactory;
import lk.ijse.Entity.Employee;
import lk.ijse.Model.EmployeeModel;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeBOImpl implements EmployeeBO {

    EmployeeDao employeeDao = (EmployeeDao) DaoFactory.getDaoFactory().getDAO(DaoFactory.DAOTypes.EMPLOYEE);
    @Override
    public ArrayList<EmployeeModel> getAllEmployee() throws SQLException, ClassNotFoundException {
        ArrayList<EmployeeModel> allemployee= new ArrayList<>();
        ArrayList<Employee> all = employeeDao.getAll();
        for (Employee e : all) {
            all.add(new Employee(e.getE_ID(),e.getNIC(),e.getFirst_Name(),e.getLast_Name(),e.getAddress(),e.getPhone_Number(),e.getEmail(),e.getSalary(),e.getPosition(),e.getYear(),e.getMonth(),e.getDay()));
        }
        return allemployee;
    }
}
