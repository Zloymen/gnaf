package software.perfekt.gnaf.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.perfekt.gnaf.dao.UserDao;
import software.perfekt.gnaf.entity.User;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Transactional
    @Override
    public Iterable<User> getAll(){
        return userDao.findAll();
    }

}
