package lk.ijse.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationModel {
    private String code;
    private String description;
    private int qty;
    private double unitPrice;
    private double total;
}
