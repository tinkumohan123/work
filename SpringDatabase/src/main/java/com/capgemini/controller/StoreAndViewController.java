package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.capgemini.dto.RegisterDto;
import com.capgemini.services.RegisterService;

@Controller
public class StoreAndViewController {

	@Autowired
	RegisterService service;

	@RequestMapping(value ="/register", method=RequestMethod.GET)
	public ModelAndView do1(Model model)
	{
		 ModelAndView mav =new ModelAndView();
		mav.addObject("ma", new RegisterDto());
		mav.setViewName("register");
		return mav;
	}
	
	@RequestMapping(value ="/show", method=RequestMethod.GET)
	public ModelAndView do2(RegisterDto obj)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",service.showData());
		mav.addObject("ma", obj);
		mav.setViewName("show");
		return mav;
	}
	
	@RequestMapping(value ="/storedata", method=RequestMethod.POST)
	public ModelAndView do1(@ModelAttribute("ma") RegisterDto o1)
	{
		 ModelAndView mav = new ModelAndView();
		 
		 
			try
			{
				
				mav.addObject("hello",service.saveData(o1));
				
				mav.setViewName("register");
				System.out.println("DATA SAVED");
				mav.addObject("msg","Data has Saved");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return mav;
	}
	
	
}
