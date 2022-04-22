package client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class OneToManyUniDirectionalClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide guide = new Guide("20523XBEDSFDS123", "Natalie Smith", 1000);
		Student john = new Student("2022ABC123", "Jason Slater");
		Student mary = new Student("2021XYZ567", "Will Smith");
		
		guide.getStudents().add(john);
		guide.getStudents().add(mary);
		
		session.persist(guide);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}