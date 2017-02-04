package edu.mum.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.entity.User;
import edu.mum.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)
	public String navigateToRegisterUser(Model model) {
		model.addAttribute("user", new User());
		return "userRegistration";
	}
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(User user, BindingResult result, ModelMap model) {
		userService.createNewUser(user);
		model.addAttribute("success", "Registered successfully");
		return "userRegistration";
	}
	
	
}
