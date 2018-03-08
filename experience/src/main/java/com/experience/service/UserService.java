package com.experience.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.experience.entity.User;

@Service
public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(Integer id);
	
	public User saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
	
}
