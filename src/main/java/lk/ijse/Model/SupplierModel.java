package lk.ijse.Model;

import lk.ijse.controller.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class SupplierModel extends Supplier {
    private String S_ID;
    private String Name;
    private String Address;
    private int Phone_Number;
    private String Ingredient;
    private String Date_Of_Purchase;
    private String Amount_due;
    private String Date_of_Payment;
    private String Payment_Type;
    private String Amount_Paid;
}
