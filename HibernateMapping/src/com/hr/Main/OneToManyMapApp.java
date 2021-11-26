package com.hr.Main;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hr.OneToMany.Answer;
import com.hr.OneToMany.Question;

public class OneToManyMapApp {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		// Creating question 
		
		/*
		 * Question q1=new Question(); q1.setQuestionId(1212);
		 * q1.setQuestion("What is JAVA?");
		 * 
		 * 
		 * 
		 * 
		 * // Creating answer Answer answer=new Answer(); answer.setAnswerId(343);
		 * answer.setAnswer("Java is programming language"); answer.setQuestion(q1);
		 * 
		 * Answer answer1=new Answer(); answer1.setAnswerId(344);
		 * answer1.setAnswer("With the help of java we can create softwares!!");
		 * answer1.setQuestion(q1);
		 * 
		 * Answer answer2=new Answer(); answer2.setAnswerId(345);
		 * answer2.setAnswer("Java has different type of framework!!");
		 * answer2.setQuestion(q1);
		 * 
		 * List<Answer> list=new ArrayList<Answer>(); list.add(answer);
		 * list.add(answer1); list.add(answer2);
		 * 
		 * 
		 * q1.setAnswer(list);
		 */
		
		// session
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		// save
		/*
		 * s.save(q1); s.save(answer); s.save(answer1); s.save(answer2);
		 */
		
		Question q=(Question)s.get(Question.class, 1212);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		  //Lazy 
		System.out.println(q.getAnswer().size());
		 
		
		
	
		
		tx.commit();
	
		s.close();
		
		factory.close();
		
		
	}
}
