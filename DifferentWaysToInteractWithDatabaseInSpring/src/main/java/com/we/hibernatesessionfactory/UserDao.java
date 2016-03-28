package com.we.hibernatesessionfactory;

import java.util.List;



public interface UserDao {
	
	public List<User>  getAllUsers();
	public List<User> getUserByUserName(String username);
	public void createUser(User user);

}
