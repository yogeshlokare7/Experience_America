package com.experience.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.experience.entity.User;

public interface UserService {
	
	public final String USER_LIST_QUERY="from User";
	
	public List<User> getUsers() throws Exception;
	
	public User getUser(Integer id) throws Exception;
	
	public Integer saveUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void deleteUser(User user) throws Exception;
	
}
