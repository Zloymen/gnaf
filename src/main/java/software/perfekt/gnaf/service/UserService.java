package software.perfekt.gnaf.service;

import software.perfekt.gnaf.entity.User;

public interface UserService {

    Iterable<User> getAll();
}
