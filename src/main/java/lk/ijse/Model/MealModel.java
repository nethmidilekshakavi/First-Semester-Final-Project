package lk.ijse.Model;

import lk.ijse.controller.Meal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MealModel extends Meal {
    private String MID;
    private String Name;
    private String Price;


}
