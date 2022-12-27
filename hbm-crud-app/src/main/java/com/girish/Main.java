package com.girish;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.girish.entity.Employee;

public class Main {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		Employee emp = new Employee(21,"Girish", 35500.50f, "Mech", new Date());
		s.save(emp);
		t.commit();
		s.close();
		sf.close();
	}
}
// Hi Gira Deu ka Jira !
// trial 2nd