package com.capgemini.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.dto.LoginDto;
import com.capgemini.dto.NewUserDto;
import com.capgemini.services.RegisterService;

@Controller
public class MyController
{
	
	@Autowired
	RegisterService service;
	@RequestMapping(value ="/", method=RequestMethod.GET)
	public ModelAndView do1()
	{
		 ModelAndView mav =new ModelAndView();
		 LoginDto obj = new LoginDto();
		 mav.addObject("ma",obj);
		 mav.setViewName("login");
		 return mav;
	}
	
	
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public ModelAndView do2( ModelAndView mav, @Valid @ModelAttribute("ma") LoginDto obj,BindingResult result)
	{
		
		String username = obj.getUsername();
		 String password = obj.getPassword();
		 if(result.hasErrors())
		 {
			 mav.setViewName("login");
		 }
		 else{
			 
			 if(username.equalsIgnoreCase("capgemini") && password.equals("mohan"))
			 {
				 mav.setViewName("success");
				 mav.addObject("username",username);
			 }
			 else
			 {
				 mav.setViewName("error");
			 }
		 }
		 return mav;

	}
	
	@RequestMapping(value="/successnewuser",method=RequestMethod.POST)
	public ModelAndView do4(ModelAndView mav,HttpServletRequest req)
	{
		NewUserDto newuser = new NewUserDto();
		mav.addObject("ma",newuser);
		mav.setViewName("successnewuser");
		
		return mav;
	}	
}
