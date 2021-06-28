package nurlanTest.norhtwind2.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nurlanTest.norhtwind2.business.abstracts.UserService;
import nurlanTest.norhtwind2.core.dataAccess.UserDao;
import nurlanTest.norhtwind2.core.entities.User;
import nurlanTest.norhtwind2.core.utilities.results.DataResult;
import nurlanTest.norhtwind2.core.utilities.results.Result;
import nurlanTest.norhtwind2.core.utilities.results.SuccessDataResult;
import nurlanTest.norhtwind2.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccessResult("User Adedd");
	}

	@Override
	public DataResult<User> findByEmail(String email) {

		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}

}
