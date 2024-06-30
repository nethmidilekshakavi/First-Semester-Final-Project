package lk.ijse.BO.Custom;

import lk.ijse.BO.SuperBo;
import lk.ijse.Model.EmployeeModel;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeBO extends SuperBo {
    ArrayList<EmployeeModel> getAllEmployee() throws SQLException, ClassNotFoundException;
}
