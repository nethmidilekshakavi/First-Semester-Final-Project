package lk.ijse.Model.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class EmployeeTM {
    private String E_ID;
    private String NIC;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private String Phone_Number;
    private String Email;
    private String Salary;
    private String Position;
    //button delete and update
}
