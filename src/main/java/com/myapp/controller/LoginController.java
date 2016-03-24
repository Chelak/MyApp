package com.myapp.controller;

import com.myapp.domain.User;
import com.myapp.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by scelac on 3/22/16.
 */
@Controller
@RequestMapping()
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("loginForm") User user) {

        String password = user.getPassword();
        String userEmail = user.getEmail();
        User userCheck = userService.findByEmail(userEmail);
        if ((password != null && password.equals(userCheck.getPassword())) && (userEmail != null && userEmail.equals(userCheck.getEmail())))
        {
            modelMap.put("userInfo", userCheck.getFirstName());
            return "index";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "login";
        }

    }

    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String getRegistration()
    {
        return "registration";
    }

    @RequestMapping(value = "registration", method = RequestMethod.POST)
    public String  addUser (ModelMap modelMap, @ModelAttribute("addUser") User user)
    {
        userService.addUser(user);
        modelMap.put("error", "User: " + user.getEmail() + " added");
        return "login";
    }

}
