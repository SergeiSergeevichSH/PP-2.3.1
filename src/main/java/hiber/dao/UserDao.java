package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
//   void add(User user);

   void addUser(User user);

   User getUserById(long id);

   void updateUser(User user);

   void  deleteUser(long id);

   List<User> listUsers();
}
