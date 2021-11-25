package org.example.model.dao.implementation;

import org.example.model.dao.AbstractDAO;
import org.example.model.entity.Rating;
import org.example.model.entity.User;
import org.example.util.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AbstractDAO<User> {

        private static String FIND_ALL = "select * from horetskyi.user";
        private static String FIND_ONE = "select * from horetskyi.user where iduser=?";
        private static String CREATE = "insert horetskyi.user (`name`, `surname`, `age`,`gender`) values (?, ?, ?, ?)";
        private static String UPDATE = "UPDATE horetskyi.user SET name=?, surname=?, age=?, gender=? where iduser=?";
        private static String DELETE = "DELETE from horetskyi.user where iduser=?";

    @Override
    public List<User> findAll() {
        List<User> ratings = new ArrayList<>();
        try(PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ALL)) {
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("iduser"),
                        resultSet.getInt("age"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender")
                );
                ratings.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ratings;
    }

    @Override
    public User findOne(Integer id) {
        User user = null;
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(FIND_ONE)) {
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = new User(
                        resultSet.getInt("iduser"),
                        resultSet.getInt("age"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("gender")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void create(User user) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(CREATE)) {
            statement.setString(1, String.valueOf(user.getName()));
            statement.setString(2, String.valueOf(user.getSurname()));
            statement.setInt(3, user.getAge());
            statement.setString(4, String.valueOf(user.getGender()));
            statement.executeUpdate();
            System.out.println(statement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void update(Integer id, User user) {
        try (PreparedStatement statement = ConnectionManager.getConnection().prepareStatement(UPDATE)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getSurname());
            statement.setInt(3, user.getAge());
            statement.setString(4, user.getGender());
            statement.setInt(5, id);
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
