package lk.ijse.Model;

import lk.ijse.controller.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeModel extends Employee {
    private String E_ID;
    private String NIC;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private int Phone_Number;
    private String Email;
    private String Salary;
    private String Position;
    private int Year;
    private int Month;
    private int Day;



}
