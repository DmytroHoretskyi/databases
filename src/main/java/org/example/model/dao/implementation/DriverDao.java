package org.example.model.dao.implementation;

import org.example.model.dao.AbstractDAO;

import org.example.model.entity.Driver;
import org.example.model.entity.Driver;
import org.example.util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DriverDao implements AbstractDAO<Driver> {

    private static String FIND_ALL = "select * from horetskyi.driver";
    private static String FIND_ONE = "select * from horetskyi.driver where iddriver=?";
    private static String CREATE = "insert horetskyi.driver (`name`, `surname`, `age`,`number_of_cars`, `experience`, `rating_idrating`) values (?, ?, ?, ?, ?, ?)";
    private static String UPDATE = "UPDATE horetskyi.driver SET name=?, surname=?, age=?, number_of_cars=?, experience=?,rating_idrating=? where iddriver=?";
    private static String DELETE = "DELETE from horetskyi.driver where iddriver=?";

    @Override
    public List<Driver> findAll() {
        List<Driver> ratings = new ArrayList<>();
        try(PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ALL)) {
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Driver driver = new Driver(
                        resultSet.getInt("iddriver"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getInt("number_of_cars"),
                        resultSet.getInt("experience"),
                        resultSet.getInt("rating_idrating")

                );
                ratings.add(driver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ratings;
    }

    @Override
    public Driver findOne(Integer id) {
        Driver driver = null;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ONE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                driver = new Driver(
                        resultSet.getInt("iddriver"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getInt("number_of_cars"),
                        resultSet.getInt("experience"),
                        resultSet.getInt("rating_idrating")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    @Override
    public void create(Driver driver) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(CREATE)) {
            statement.setString(1, String.valueOf(driver.getName()));
            statement.setString(2, String.valueOf(driver.getSurname()));
            statement.setInt(3,driver.getAge());
            statement.setInt(4, driver.getNumberOfCars());
            statement.setInt(5, driver.getExperience());
            statement.setInt(6, driver.getRatingId());
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Driver driver) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(UPDATE)) {
            statement.setString(1, String.valueOf(driver.getName()));
            statement.setString(2, String.valueOf(driver.getSurname()));
            statement.setInt(3,driver.getAge());
            statement.setInt(4, driver.getNumberOfCars());
            statement.setInt(5, driver.getExperience());
            statement.setInt(6, driver.getRatingId());
            statement.setInt(7, id);
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(DELETE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

