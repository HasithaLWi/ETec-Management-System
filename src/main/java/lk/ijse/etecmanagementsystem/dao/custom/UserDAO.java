package lk.ijse.etecmanagementsystem.dao.custom;

import lk.ijse.etecmanagementsystem.dao.CrudDAO;
import lk.ijse.etecmanagementsystem.dao.CrudUtil;
import lk.ijse.etecmanagementsystem.dto.UserDTO;
import lk.ijse.etecmanagementsystem.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserDAO extends CrudDAO<User> {

    boolean validateCredentials(String username, String password) throws SQLException;

    boolean validateUserName(String username) throws SQLException;

    String getUserRole(String username) throws SQLException;

    String getName(String username) throws SQLException;

    int getUserId(String username) throws SQLException;

    boolean validateUserEmail(String username, String email) throws SQLException;

    String getUserPassword(String username) throws SQLException;
}

