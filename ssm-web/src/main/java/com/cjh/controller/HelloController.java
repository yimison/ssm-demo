package com.cjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjh.dao.UserMapper;
import com.cjh.model.User;
import com.cjh.services.IUserService;

@Controller
public class HelloController {

	@Autowired
	IUserService UserService;
	@Autowired
	UserMapper userDao;

	@RequestMapping("/Hello/Hai.do")
	public String Hai() {
		User user = new User();
		user.setName("cjh");
		UserService.Introduce(user);

		int userCount = 1;
		System.out.println("the total count of user is "+ userCount);
		return "Hai";
	}
	
	@RequestMapping("/Hello/InsertTest.do")
	public String InsertTest() {
		User user = new User();
		user.setId("6");
		user.setName("cjh");

		int result = userDao.insert(user);
		if (result>0) {
			System.out.println("insert success , "+ user.toString());
		}
		else {
			System.out.println("insert fail");
		}
		
		return "Hai";
	}
}
