package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> index();
    public User show (int id);
    public void save (User user);
    public void update (User user);
    public void delete (User user);
}
