package com.sts.userservice.userserviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sts.userservice.entity.User;

@Service
public class UserService {
  
	List<User> UserList=List.of(new User(1,"prathamesh","kadamprathamesh206"),new User(1,"prathamesh","kadamprathamesh206"));
 
	
	public User getUser(int id) {
		return this.UserList.stream().filter(u->u.getId()==id).findAny().orElse(null);
	}
}
