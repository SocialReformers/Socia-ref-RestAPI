package main.java.com.socialreformer.service;

import main.java.com.socialreformer.model.RegisteredUser;

public interface RegisterUserService {

public RegisteredUser registerUser(RegisteredUser user);	
	
	public long autheticateUser(String emailAddr,String password);

}
