package client;



import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Message;
import util.HIbernateUtil;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		Transaction t =  session.beginTransaction();
		
		Message message = new Message("Hii From anootations");
		
		session.save(message);
		
		t.commit();
		session.close();
	}
}