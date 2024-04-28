package lk.ijse.Model.TM;

import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MealTM {
    private String MID;
    private String Name;
    private String Price;
    private JFXButton Update;
    private JFXButton Delete;
}
