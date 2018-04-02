package software.perfekt.gnaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.perfekt.gnaf.dao.UserDao;
import software.perfekt.gnaf.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public Iterable<User> getAll(){
        return userDao.findAll();
    }

}
