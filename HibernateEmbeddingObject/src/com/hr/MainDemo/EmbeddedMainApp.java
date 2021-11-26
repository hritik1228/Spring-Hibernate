package com.hr.MainDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hr.embedEntity.Certificate;
import com.hr.embedEntity.Student;

public class EmbeddedMainApp {
	
	public static void main(String[] args) {
		System.out.println("Project Started..!");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Hritik Kumar");
		student1.setCity("Dhanbad");
		
		Certificate certificate1=new Certificate();
		certificate1.setCourse("Hibernate");
		certificate1.setDuration("2 hour");
		student1.setCertificate(certificate1);
		
		Student student2=new Student();
		student2.setId(2);
		student2.setName("Ram Kumar");
		student2.setCity("Barakar");
	
		
		Certificate certificate2=new Certificate();
		certificate2.setCourse("Core Spring");
		certificate2.setDuration("4 hour");
		student2.setCertificate(certificate2);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		//Objects save
		
		s.save(student1);
		s.save(student2);
		
		tx.commit();
		
		s.close();
	
		factory.close();
	
	}
	
	

}
