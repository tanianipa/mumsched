package edu.mum.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.entity.User;
import edu.mum.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(Model model) {
		model.addAttribute("user", new User());
		return "loginform";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitLogin(User user, BindingResult result, ModelMap model) throws UnsupportedEncodingException {

		if (result.hasErrors()) {
			return "loginform";
		}

		boolean userExists = loginService.checkLogin(user.getUsername(), user.getPassword());
		if (userExists) {
			model.put("user", user);
			// String userid = user.getUsername(); // this stores the email id
			// (which is uses as the userid
			// to go to specific profile)

			// RedirectAttributes.addAttribute("userid", userid);
			// String encodedString = URLEncoder.encode(user.getUsername(),
			// "UTF-8");
			// System.out.format("'%s'\n", encodedString);

			model.addAttribute("userid", user.getUsername());
			
				return "redirect:/facultyController/getFacultyById/{userid}";
			

		} else {
			result.rejectValue("username", "invaliduser");
			return "loginform";
		}

	}

}
