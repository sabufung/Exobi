package hello.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public UserEntity getUserById(long id) {
		return repository.findOne(id);
	}

	@Override
	public UserEntity getUserByNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return repository.findByNameAndPassword(username, password);
	}

	@Override
	public long countUser() {
		return repository.count();
	}

	@Override
	public UserEntity getUserByLevel(int id) {
		// TODO Auto-generated method stub
		return repository.findByLevel(id);
	}

	@Override
	public UserEntity insertUser(UserEntity user) {
		// TODO Auto-generated method stub
		return repository.saveAndFlush(user);
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		UserEntity check = repository.findOne(user.getId());
		if (check == null) {
			return check;
		}
		check.setData(user);
		return repository.saveAndFlush(check);
	}

	@Override
	public UserEntity deleteUser(UserEntity user) {
		// TODO Auto-generated method stub
		UserEntity check = repository.findOne(user.getId());
		if (check == null) {
			return check;
		}
		repository.delete(check);
		return check;
	}

	@Override
	public UserEntity getUserByNameLike(String username) {
		// TODO Auto-generated method stub
		return repository.findByNameLike(username);
	}

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
