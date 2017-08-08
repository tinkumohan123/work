package com.capgemini.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.RegisterDao;
import com.capgemini.dto.RegisterDto;
import com.capgemini.model.RegisterModel;
import com.capgemini.services.RegisterService;


@Service
public class RegisterServiceImpl implements RegisterService
{
	@Autowired
	RegisterDao rdao;
	
	public RegisterModel saveData(RegisterDto obj) throws Exception
	{
		RegisterModel rmo = new RegisterModel();
		rmo.setFirstname(obj.getFirstname());
		rmo.setLastname(obj.getLastname());
		rmo.setContact(obj.getContact());
		rmo.setEmail(obj.getEmail());
		rmo.setPassword(obj.getPassword());
		rmo= rdao.saveData(rmo);
		
		return rmo;
	}	
	public List showData()
	{
	    List list = rdao.showData();
	    return list;
	}


	
}