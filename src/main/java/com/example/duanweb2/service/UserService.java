package com.example.duanweb2.service;

import com.example.duanweb2.entity.User;
import com.example.duanweb2.security.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);
	void save(WebUser webUser);


}
