package software.perfekt.gnaf.dao;

import org.springframework.data.repository.CrudRepository;
import software.perfekt.gnaf.entity.User;


public interface UserDao extends CrudRepository<User, Long> {
}
