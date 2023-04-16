package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImp implements UserService{
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void add(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        userDao.deleteUser(id);
    }
    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
