package com.capgemini.services;

import java.util.List;

import com.capgemini.dto.RegisterDto;
import com.capgemini.model.RegisterModel;

public interface RegisterService
{
	public RegisterModel saveData(RegisterDto obj) throws Exception;
	public List showData();
}