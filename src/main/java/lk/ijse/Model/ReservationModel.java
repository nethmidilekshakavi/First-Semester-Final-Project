package lk.ijse.Model;

import lk.ijse.controller.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationModel {
    private int RID;
    private int CID;
    private String Date;
    private String description;
    private String time;
    private String total;
    private int EID;
    private int  DID;


}
