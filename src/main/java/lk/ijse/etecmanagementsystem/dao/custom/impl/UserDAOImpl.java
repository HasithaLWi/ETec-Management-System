package lk.ijse.etecmanagementsystem.dao.custom.impl;

import lk.ijse.etecmanagementsystem.dao.custom.UserDAO;
import lk.ijse.etecmanagementsystem.dto.UserDTO;
import lk.ijse.etecmanagementsystem.dao.CrudUtil;
import lk.ijse.etecmanagementsystem.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public List<User> getAll() throws SQLException {
        String sql = "SELECT * FROM User";
        List<User> users = new ArrayList<>();

        try (ResultSet rs = CrudUtil.execute(sql)) {
            while (rs.next()) {
                users.add(new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("contact"),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("user_name"),
                        rs.getString("password"),
                        rs.getString("role")
                ));
            }
        }
        return users;
    }

    @Override
    public boolean save(User entity) throws SQLException {
        String sql = "INSERT INTO User(name, contact, address, email, user_name, password, role) VALUES(?,?,?,?,?,?,?)";
        return CrudUtil.execute(sql,
                entity.getName(),
                entity.getContact(),
                entity.getAddress(),
                entity.getEmail(),
                entity.getUser_name(),
                entity.getPassword(),
                entity.getRole());
    }

    @Override
    public boolean update(User entity) throws SQLException {
        String sql = "UPDATE User SET name=?, contact=?, address=?, email=?, user_name=?, password=?, role=? WHERE user_id=?";
        return CrudUtil.execute(sql,
                entity.getName(),
                entity.getContact(),
                entity.getAddress(),
                entity.getEmail(),
                entity.getUser_name(),
                entity.getPassword(),
                entity.getRole(),
                entity.getUser_id());
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM User WHERE user_id=?";
        return CrudUtil.execute(sql, id);
    }

    @Override
    public User search(int id) throws SQLException {
        String sql = "SELECT * FROM User WHERE user_id=?";
        User user = null;

        try (ResultSet rs = CrudUtil.execute(sql, id)) {
            if (rs.next()) {
                user = new User(
                        rs.getInt("user_id"),
                        rs.getString("name"),
                        rs.getString("contact"),
                        rs.getString("address"),
                        rs.getString("email"),
                        rs.getString("user_name"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }
        }
        return user;
    }

    @Override
    public boolean validateCredentials(String username, String password) throws SQLException {
        // Logic to validate credentials against a data source
        String sql = "SELECT * FROM User WHERE BINARY user_name = ? AND BINARY password = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username, password)) {
            return resultSet.next();
        }
    }

    @Override
    public boolean validateUserName(String username) throws SQLException {
        String sql = "SELECT * FROM User WHERE user_name = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username)) {
            return resultSet.next();
        }
    }

    @Override
    public String getUserRole(String username) throws SQLException {
        String sql = "SELECT role FROM User WHERE user_name = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username)) {
            if (resultSet.next()) {
                return resultSet.getString("role");
            } else {
                return null;
            }
        }
    }

    @Override
    public String getName(String username) throws SQLException {
        String sql = "SELECT name FROM User WHERE user_name = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username)) {
            if (resultSet.next()) {
                return resultSet.getString("name");
            } else {
                return null;
            }
        }
    }

    @Override
    public int getUserId(String username) throws SQLException {
        String sql = "SELECT user_id FROM User WHERE user_name = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username)) {
            if (resultSet.next()) {
                return resultSet.getInt("user_id");
            } else {
                return -1;
            }
        }
    }

    @Override
    public boolean validateUserEmail(String username, String email) throws SQLException {
        String sql = "SELECT * FROM User WHERE user_name = ? AND email = ?";
        try (ResultSet resultSet = CrudUtil.execute(sql, username, email)) {
            return resultSet.next();
        }
    }

    @Override
    public String getUserPassword(String username) throws SQLException {
        String sql = "SELECT password FROM User WHERE user_name = ?";

        try (ResultSet resultSet = CrudUtil.execute(sql, username)) {
            if (resultSet.next()) {
                return resultSet.getString("password");
            } else {
                return null;
            }
        }

    }
}
