package lk.ijse.Dao;

import lk.ijse.Dao.Impl.CustomerDaoImpl;
import lk.ijse.Dao.Impl.MealDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DaoFactory() : daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER,ITEM,ORDER,ORDER_DETAILS,QUERY_DAO,MEAL
    }

    public SuperDao getDAO(DAOTypes types){
        switch (types) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case MEAL:
                return new MealDaoImpl();

        }
        return null;
    }
}
