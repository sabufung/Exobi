package hello.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public UserEntity insertUser(UserEntity user);

	public UserEntity updateUser(UserEntity user);

	public UserEntity deleteUser(UserEntity user);

	public UserEntity getUserById(long id);

	public UserEntity getUserByLevel(int id);

	public UserEntity getUserByNameAndPassword(String username, String password);

	public UserEntity getUserByNameLike(String username);

	public List<UserEntity> getAll();

	public long countUser();
}