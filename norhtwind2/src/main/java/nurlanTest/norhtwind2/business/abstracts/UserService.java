package nurlanTest.norhtwind2.business.abstracts;

import nurlanTest.norhtwind2.core.entities.User;
import nurlanTest.norhtwind2.core.utilities.results.DataResult;
import nurlanTest.norhtwind2.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
