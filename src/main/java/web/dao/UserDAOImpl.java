package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> index() {

        Query query = entityManager.createQuery("from User");
        return query.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public User show (int id) {
        return (entityManager.find(User.class, id));
    }

    @Override
    public void save (User user) {
        entityManager.persist(user);
    }

    @Override
    public void update (User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete (User user) { entityManager.remove(user);
    }
}
