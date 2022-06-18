package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getUsers();

    public User getUserById(int id);

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
