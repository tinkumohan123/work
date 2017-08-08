package com.capgemini.dao.impl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dao.RegisterDao;
import com.capgemini.model.RegisterModel;

@Repository
public class RegisterDaoImpl implements RegisterDao
{
	@Autowired
	SessionFactory sf;
	@Override
	public RegisterModel saveData(RegisterModel rmo)
	{
		Session s1 = this.sf.openSession();
		Transaction t1 = s1.getTransaction();
		t1.begin();
		try{
			s1.save(rmo);
			t1.commit();
		}
		catch(Exception e)
		{
			t1.rollback();
		}
		finally
		{
			s1.close();
		}
		return rmo;
	}


	public List showData()
	{
		Session s1 = sf.openSession();
		Transaction t1 = s1.getTransaction();
		t1.begin();
		List list = null;
		try
		{
			list = s1.createQuery("FROM RegisterModel").list();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			s1.flush();
			s1.close();
		}
		return list;
	}

}