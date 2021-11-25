package org.example.model.dao.implementation;

import org.example.model.dao.AbstractDAO;
import org.example.model.entity.Route;
import org.example.model.entity.User;
import org.example.util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class RouteDao implements AbstractDAO<Route> {

    private static String FIND_ALL = "select * from horetskyi.route";
    private static String FIND_ONE = "select * from horetskyi.route where idroute=?";
    private static String CREATE = "insert horetskyi.route (`start`, `end`, `data`,`price`,`user_iduser`, `driver_iddriver`) values (?, ?, ?, ?, ?, ?)";
    private static String UPDATE = "UPDATE horetskyi.route SET start=?, end=?, data=?, price=?,user_iduser=?,driver_iddriver=? where idroute=?";
    private static String DELETE = "DELETE from horetskyi.route where idroute=?";

    @Override
    public List<Route> findAll() {
        List<Route> ratings = new ArrayList<>();
        try(PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ALL)) {
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Route route = new Route(
                        resultSet.getInt("idroute"),
                        resultSet.getString("start"),
                        resultSet.getString("end"),
                        resultSet.getString("data"),
                        resultSet.getInt("price"),
                        resultSet.getInt("user_iduser"),
                        resultSet.getInt("driver_iddriver")
                );
                ratings.add(route);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ratings;
    }

    @Override
    public Route findOne(Integer id) {
        Route route = null;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ONE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                route = new Route(
                        resultSet.getInt("idroute"),
                        resultSet.getString("start"),
                        resultSet.getString("end"),
                        resultSet.getString("data"),
                        resultSet.getInt("price"),
                        resultSet.getInt("user_iduser"),
                        resultSet.getInt("driver_iddriver")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return route;
    }

    @Override
    public void create(Route route) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(CREATE)) {
            statement.setString(1, String.valueOf(route.getStart()));
            statement.setString(2, String.valueOf(route.getEnd()));
            statement.setString(3,String.valueOf(route.getData()));
            statement.setInt(4, route.getPrice());
            statement.setInt(5, route.getIdUser());
            statement.setInt(6, route.getIdDriver());
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Integer id, Route route) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(UPDATE)) {
            statement.setString(1, route.getStart());
            statement.setString(2, route.getEnd());
            statement.setString(3,route.getData());
            statement.setInt(4, route.getPrice());
            statement.setInt(5, route.getIdUser());
            statement.setInt(6, route.getIdDriver());
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

