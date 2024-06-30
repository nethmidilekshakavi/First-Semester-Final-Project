package lk.ijse.BO;

import lk.ijse.BO.Impl.CustomerBOImpl;
import lk.ijse.BO.Impl.EmployeeBOImpl;
import lk.ijse.BO.Impl.MealBOImpl;
import lk.ijse.Dao.Impl.CustomerDaoImpl;
import lk.ijse.Dao.Impl.MealDaoImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMER,ITEM,MEAL,EMPLOYEE
    }

    //Object creation logic for BO objects
    public SuperBo getBO(BOTypes types){
        switch (types){
            case CUSTOMER:
                return new CustomerBOImpl();
            case MEAL:
                return  new MealBOImpl();
            case EMPLOYEE:
                return new EmployeeBOImpl();

        }
        return null;
    }
}
