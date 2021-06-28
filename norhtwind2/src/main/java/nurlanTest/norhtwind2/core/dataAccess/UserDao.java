package nurlanTest.norhtwind2.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import nurlanTest.norhtwind2.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String Email);
}
