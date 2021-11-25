package org.example.model.dao.implementation;

import org.example.model.dao.AbstractDAO;
import org.example.model.entity.Rating;
import org.example.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RatingDao implements AbstractDAO<Rating> {

    private static String FIND_ALL = "select * from horetskyi.rating";
    private static String FIND_ONE = "select * from horetskyi.rating where idrating=?";
    private static String CREATE = "insert horetskyi.rating (`stars`) values (?)";
    private static String UPDATE = "UPDATE horetskyi.rating SET stars=? where idrating=?";
    private static String DELETE = "DELETE from horetskyi.rating where idrating=?";


    @Override
    public List<Rating> findAll(){
        List<Rating> ratingList = new ArrayList<>();
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(FIND_ALL)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Rating rating = new Rating(resultSet.getInt("idrating"),resultSet.getInt("stars"));
                ratingList.add(rating);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return ratingList;
    }

    @Override
    public Rating findOne(Integer id){
        Rating rating = null;
        try (PreparedStatement statement = getConnection().prepareStatement(FIND_ONE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                rating = new Rating(
                        resultSet.getInt("idrating"),
                        resultSet.getInt("stars")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rating;
    }

    @Override
    public void create(Rating rating) {
        try (PreparedStatement statement = getConnection().prepareStatement(CREATE)) {
            statement.setInt(1, rating.getStars());
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Rating rating){
        try (PreparedStatement statement = getConnection().prepareStatement(UPDATE)) {
            statement.setInt(1, rating.getStars());
            statement.setInt(2, id);
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id){
        try (PreparedStatement statement = getConnection().prepareStatement(DELETE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Connection getConnection(){
        return ConnectionManager.getConnection();
    }
}
