package lk.ijse.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
