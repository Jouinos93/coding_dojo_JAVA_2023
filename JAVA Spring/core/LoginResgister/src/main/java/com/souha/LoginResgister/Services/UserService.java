package com.souha.LoginResgister.Services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.souha.LoginResgister.Models.LoginUser;
import com.souha.LoginResgister.Models.User;
import com.souha.LoginResgister.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
		// TO-DO: Additional validations!
		// Reject if email is taken
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			result.rejectValue("email", "registerError", "Email is Taken");
		}
		// Does the entered password match the confirmation password?
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password", "registerError", "passwords does not match");
		}
		
		if(result.hasErrors()) {
			return null;
		}else {
			// Hash and set password, save the user to database
			String hashdPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashdPW);
			// SAVE the USER
			return userRepo.save(newUser);
		}
		
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		// TO-DO: Additional validations!
		// FIND IF USER IS PRESENT IN DB
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "Email is not found");
		}else {
			User user = potentialUser.get();
			// Check password
			if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword() )) {
				result.rejectValue("password", "loginErrors", "Invalid Password");
			}
			if(result.hasErrors()) {
				return null;
			}else {
				return user;
			}
		}
		
		return null;
	}
	
	//   READ ONE
    public User findOne(Long id) {
    	Optional<User> maybeUser = userRepo.findById(id);
    	if(maybeUser.isPresent()) {
    		return maybeUser.get();
    	} else {
    		return null;
    	}
}
}