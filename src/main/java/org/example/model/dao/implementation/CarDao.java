package org.example.model.dao.implementation;

import org.example.model.dao.AbstractDAO;
import org.example.model.entity.Car;
import org.example.model.entity.Route;
import org.example.util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CarDao implements AbstractDAO<Car> {

    private static String FIND_ALL = "select * from horetskyi.car";
    private static String FIND_ONE = "select * from horetskyi.car where idcar=?";
    private static String CREATE = "insert horetskyi.car (`model`, `mark`, `color`,`car_number`) values (?, ?, ?, ?)";
    private static String UPDATE = "UPDATE horetskyi.car SET model=?, mark=?, color=?, car_number=? where idcar=?";
    private static String DELETE = "DELETE from horetskyi.car where idcar=?";

    @Override
    public List<Car> findAll() {
        List<Car> ratings = new ArrayList<>();
        try(PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ALL)) {
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Car car = new Car(
                        resultSet.getInt("idcar"),
                        resultSet.getString("model"),
                        resultSet.getString("mark"),
                        resultSet.getString("color"),
                        resultSet.getString("car_number")
                );
                ratings.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ratings;
    }


    @Override
    public Car findOne(Integer id) {
        Car car = null;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ONE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                car = new Car(
                        resultSet.getInt("idcar"),
                        resultSet.getString("model"),
                        resultSet.getString("mark"),
                        resultSet.getString("color"),
                        resultSet.getString("car_number")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }

    @Override
    public void create(Car car) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(CREATE)) {
            statement.setString(1, String.valueOf(car.getModel()));
            statement.setString(2, String.valueOf(car.getMark()));
            statement.setString(3,String.valueOf(car.getColor()));
            statement.setString(4, String.valueOf(car.getCarNumber()));
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(Integer id, Car car) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(UPDATE)) {
            statement.setString(1, car.getModel());
            statement.setString(2, car.getMark());
            statement.setString(3,car.getColor());
            statement.setString(4, car.getCarNumber());
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
