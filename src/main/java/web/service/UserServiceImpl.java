package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserDAO userDao;

    @Override
    @Transactional
    public List<User> index() {

        return userDao.index();

    }

    @Override
    @Transactional
    public User show (int id) {
        return (entityManager.find(User.class,id));
    }

    @Override
    @Transactional
    public void save (User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update (User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public void delete (User user) {
        entityManager.remove(entityManager.find(User.class,user.getId()));
    }


}
