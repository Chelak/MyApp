package com.myapp.controller;

import com.myapp.domain.User;
import com.myapp.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {

	@Autowired
	UserService userService;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		User userCheck = userService.findById(1);
		model.addAttribute("message", "Hello Please Login");
		return "login";
	}
}