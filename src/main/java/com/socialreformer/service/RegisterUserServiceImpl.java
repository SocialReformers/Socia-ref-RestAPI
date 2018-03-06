package main.java.com.socialreformer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.java.com.socialreformer.Repository.RegisteredUserRepository;
import main.java.com.socialreformer.model.RegisteredUser;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Resource
	RegisteredUserRepository registerUserRepository;

	public RegisteredUser registerUser(RegisteredUser user){
		return registerUserRepository.save(user);
	}
	
	public long autheticateUser(String emailAddr,String password){
		return registerUserRepository.countByEmailAddrAndPassword(emailAddr, password);		
	}
	
		
	
}
