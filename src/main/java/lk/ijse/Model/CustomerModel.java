package lk.ijse.Model;

import lk.ijse.controller.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerModel extends Customer {

    private String C_ID;
    private  String NIC;
    private  String First_Name;
    private  String Last_Name;
    private  String Address;
    private  int Phone_Number;
    private  String Email;

    public CustomerModel(String nic, String firstName, String lastName, String address, int phoneNumber, String email) {

    }
}
