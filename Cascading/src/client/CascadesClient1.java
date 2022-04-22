package client;

import org.hibernate.Session;

import entity.Guide;
import entity.Student;
import util.HIbernateUtil;

public class CascadesClient1 {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Guide max = new Guide("ABCDEF12345", "Chris Rock", 10000);
		Student john = new Student("2022ABC123", "Will Smith", max);
//		Student percy = new Student("2022ABC987", "Percy Williams", max);
//		
//		Guide terence = new Guide("JDSFII67339", "Terence Junior", 2000);
//		Student mary = new Student("2021XYZ567", "Julie Mary", terence);
//				
		session.persist(john);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
	
}