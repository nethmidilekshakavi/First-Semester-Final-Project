package lk.ijse.Repository;

import lk.ijse.DB.DbConnection;
import lk.ijse.Model.CustomerModel;
import lk.ijse.Model.IngredientModel;
import lk.ijse.Model.MealModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngredientRepo {
    public static boolean save(IngredientModel ingredientModel) throws SQLException {
        try {
            Connection connection = DbConnection.getInstance().getConnection();
            PreparedStatement ptsm = connection.prepareStatement("INSERT INTO Ingredient VALUES (?,?,?,?)");
            ptsm.setString(1,ingredientModel.getI_ID());
            ptsm.setString(2,ingredientModel.getDescription());
            ptsm.setString(3,ingredientModel.getQty_On_Hand());
            ptsm.setString(4,ingredientModel.getSupplier());

            int i;
            i = ptsm.executeUpdate();
            return i > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateIngredient(IngredientModel ingredientModel) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Ingredient SET  Description = ?,Qty_On_Hand = ?,S_ID = ? WHERE I_ID = ?");
        pstm.setString(1,ingredientModel.getDescription());
        pstm.setString(2,ingredientModel.getQty_On_Hand());
        pstm.setString(3,ingredientModel.getSupplier());
        pstm.setString(4,ingredientModel.getI_ID());

        return pstm.executeUpdate() > 0;
    }

    public static boolean delete(String id) throws SQLException {
        try{
            Connection connection= DbConnection.getInstance().getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("delete from Ingredient where I_ID=?");
            preparedStatement.setString(1,id);
            int i;
            i=preparedStatement.executeUpdate();
            return i > 0;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static IngredientModel searchById(String id) throws SQLException {
        String sql = "SELECT * FROM Ingredient WHERE I_ID = ?";

        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()) {
            String I_ID = resultSet.getString(1);
            String description = resultSet.getString(2);
            String QOH = resultSet.getString(3);
            String supplier = resultSet.getString(4);

            IngredientModel ingredientModel = new IngredientModel(I_ID,description,QOH,supplier);

           return ingredientModel;
        }
        return null;
    }

    public static ArrayList<IngredientModel> getAll() throws SQLException {
        ArrayList<IngredientModel>ingredientModels =new ArrayList<>();
        try{
            Connection connection =DbConnection.getInstance().getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement("select * from Ingredient");
            ResultSet resultSet =preparedStatement.executeQuery();

            while (resultSet.next()){
              IngredientModel ingredientModel =new IngredientModel(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                ingredientModels.add(ingredientModel);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return ingredientModels;
    }

    public static List<String> getIds() throws SQLException {
        String sql = "SELECT C_ID FROM Ingredient";
        PreparedStatement pstm = DbConnection.getInstance().getConnection()
                .prepareStatement(sql);

        List<String> idList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            idList.add(id);
        }
        return idList;
    }













}
