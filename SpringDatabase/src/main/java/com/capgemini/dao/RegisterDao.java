package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.RegisterModel;

public interface RegisterDao
{
    public RegisterModel saveData(RegisterModel rmo) throws Exception;
    public List showData();
}

