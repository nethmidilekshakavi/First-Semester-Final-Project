package lk.ijse.Model;

import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class OrderModel {
    private String orderId;
    private String customerId;
    private Date date;

}
