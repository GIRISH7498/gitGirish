package com.girish.asg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Delete {

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
		Student st = new Student(22,"Harshal","JalgaonPorya");
		s.delete(st);
		t.commit();
		s.close();
		sf.close();
	}
}
