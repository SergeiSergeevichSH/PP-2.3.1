package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUserById(long id);

    void updateUser(User user);

    void  deleteUser(long id);

    List<User> listUsers();

}
