package org.jsp.ecommerceapp.dao;


import java.util.Optional;

import org.jsp.ecommerceapp.model.Merchant;
import org.jsp.ecommerceapp.model.User;
import org.jsp.ecommerceapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao
{
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}
	
	public Optional<User> findById(int id) 
	{
		return userRepository.findById(id);
	}

	public Optional<User> verifyUserById(int id, String password) {
		return userRepository.verifyById(id, password);
	}
	public Optional<User> verifyUserByEmail(String email,String password){
		return userRepository.verifyByEmail(email,password);
	}
	
	public Optional<User> verifyUserByPhone(long phone,String password){
		return userRepository.verifyByPhone(phone,password);
	}
	
	public Optional<User> findByToken(String token)
	{
		return userRepository.findByToken(token);
	}
	
}
