package com.bezkoder.spring.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.datajpa.model.User;
import com.bezkoder.spring.datajpa.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:8080")
@RestController()
@RequestMapping("/user")
public class UserController{

@Autowired
UserRepository userRepo;



@GetMapping("/sample")
public String checkApp() {
	return "It is working";
}

@PostMapping("/user") 
public ResponseEntity<User> buildUser(@RequestBody User user){
//	userService.createUser(user);
	
    try {
    User createdUser = userRepo.save(new User(user.getName(), user.getEmail())) ;
     return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
   } catch (Exception e) {
     return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
   }
}

	
}

