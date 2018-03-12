package com.experience.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.LoginDao;
import com.experience.dto.UserDto;
import com.experience.entity.User;
import com.experience.queries.IQuery;

@Repository
public class LoginDaoImpl extends EntityTransactionImpl<User> implements LoginDao {

	@Autowired
	protected SessionFactory sessionFactory;

	public UserDto login(String username, String password) throws Exception {
		UserDto userDto = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("useremail", username);
		paramMap.put("userpwd", password);
		List<User> resultSet = getEntityListFromCustomQuery(IQuery.LOGIN_QUERY, paramMap, sessionFactory);
		for (User user : resultSet) {
			userDto = new UserDto(user);
		}
		return userDto;
	}


}
