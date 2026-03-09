package lk.ijse.etecmanagementsystem.bo.custom.impl;

import lk.ijse.etecmanagementsystem.bo.custom.UserBO;
import lk.ijse.etecmanagementsystem.dao.DAOFactory;
import lk.ijse.etecmanagementsystem.dao.custom.UserDAO;
import lk.ijse.etecmanagementsystem.dto.UserDTO;
import lk.ijse.etecmanagementsystem.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserBOImpl implements UserBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);

    @Override
    public List<UserDTO> getAllUsers() throws SQLException {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> users = userDAO.getAll();
        for (User user : users) {
            userDTOList.add(new UserDTO(
                    user.getUser_id(),
                    user.getName(),
                    user.getContact(),
                    user.getAddress(),
                    user.getEmail(),
                    user.getUser_name(),
                    user.getPassword(),
                    user.getRole()
            ));
        }
        return userDTOList;
    }

    @Override
    public UserDTO getUserById(int id) throws SQLException {
        User user = userDAO.search(id);
        return new UserDTO(
                user.getUser_id(),
                user.getName(),
                user.getContact(),
                user.getAddress(),
                user.getEmail(),
                user.getUser_name(),
                user.getPassword(),
                user.getRole()
        );
    }

    @Override
    public boolean saveUser(UserDTO userDTO) throws SQLException {
        return userDAO.save(new User(
                userDTO.getUserId(),
                userDTO.getName(),
                userDTO.getContact(),
                userDTO.getAddress(),
                userDTO.getEmail(),
                userDTO.getUserName(),
                userDTO.getPassword(),
                userDTO.getRole()
        ));
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws SQLException {
        return userDAO.save(new User(
                userDTO.getUserId(),
                userDTO.getName(),
                userDTO.getContact(),
                userDTO.getAddress(),
                userDTO.getEmail(),
                userDTO.getUserName(),
                userDTO.getPassword(),
                userDTO.getRole()
        ));
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userDAO.delete(id);
    }

    @Override
    public boolean validateCredentials(String username, String password) throws SQLException {
        return userDAO.validateCredentials(username, password);
    }

    @Override
    public boolean validateUserName(String username) throws SQLException {
        return userDAO.validateUserName(username);
    }

    @Override
    public String getUserRole(String username) throws SQLException {
        return userDAO.getUserRole(username);
    }

    @Override
    public String getName(String username) throws SQLException {
        return userDAO.getName(username);
    }

    @Override
    public int getUserId(String username) throws SQLException {
        return userDAO.getUserId(username);
    }

    @Override
    public boolean validateUserEmail(String username, String email) throws SQLException {
        return userDAO.validateUserEmail(username, email);
    }

    @Override
    public String getUserPassword(String username) throws SQLException {
        return userDAO.getUserPassword(username);
    }
}
