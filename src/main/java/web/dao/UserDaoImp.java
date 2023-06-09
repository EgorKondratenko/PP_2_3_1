package web.dao;

import org.springframework.stereotype.Service;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Service
public class UserDaoImp implements UserDao {

@PersistenceContext
private EntityManager entityManager;
    @Override
    public List<User> getall() {
        return entityManager.createQuery("from User", User.class)
                .getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void updateUser(User user, Long id) {
        user = getUser(id);
        user.setName(user.getName());
        user.setLastName(user.getLastName());
        user.setAge(user.getAge());
        user.setEmail(user.getEmail());
        user.setCar(user.getCar());
        entityManager.persist(user);
    }


}
