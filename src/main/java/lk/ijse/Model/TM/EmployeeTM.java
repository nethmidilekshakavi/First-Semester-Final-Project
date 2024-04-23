package lk.ijse.Model.TM;

import com.jfoenix.controls.JFXButton;
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
    private int Phone_Number;
    private String Email;
    private String Salary;
    private String Position;
    private JFXButton delete;
    private JFXButton update;
}
