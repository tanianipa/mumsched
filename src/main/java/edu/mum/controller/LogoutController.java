package edu.mum.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogoutController {
	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	   public String logoutSuccessfulPage(Model model,HttpSession session) {
	       model.addAttribute("title", "Logout");
	       model.addAttribute("parentLogin",null);
	       session.removeAttribute("user");
	       session.invalidate();
	       return "logoutSuccessfulPage";
	   }
}
