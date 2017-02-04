package edu.mum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
       public boolean checkLogin(String username, String password){
              System.out.println("In Service class...Check Login");
              return loginDAO.checkLogin(username, password);
       }
}