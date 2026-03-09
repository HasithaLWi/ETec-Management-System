package lk.ijse.etecmanagementsystem.bo.custom;

import lk.ijse.etecmanagementsystem.bo.SuperBO;
import lk.ijse.etecmanagementsystem.dto.UserDTO;
import lk.ijse.etecmanagementsystem.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserBO extends SuperBO {
    List<UserDTO> getAllUsers() throws SQLException;

    UserDTO getUserById(int id) throws SQLException;

    boolean saveUser(UserDTO userDTO) throws SQLException;

    boolean updateUser(UserDTO userDTO) throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    boolean validateCredentials(String username, String password) throws SQLException;

    boolean validateUserName(String username) throws SQLException;

    String getUserRole(String username) throws SQLException;

    String getName(String username) throws SQLException;

    int getUserId(String username) throws SQLException;

    boolean validateUserEmail(String username, String email) throws SQLException;

    String getUserPassword(String username) throws SQLException;
}

