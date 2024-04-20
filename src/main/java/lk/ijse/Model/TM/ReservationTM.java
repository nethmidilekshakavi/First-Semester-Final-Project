package lk.ijse.Model.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ReservationTM {
    private String code;
    private String description;
    private int qty;
    private double unitPrice;
    private double total;


}
