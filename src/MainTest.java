





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainTest {
	public static void main(String[] args) {
		try{
			System.out.println("gggg");
			   Configuration cfg=new Configuration();  
			    cfg.configure("hibernate.cfg.xml");
			    System.out.println("ff");
			    SessionFactory sf=cfg.buildSessionFactory();  
			    
		Session s=sf.openSession();
		//s.getSessionFactory().
		s.getSessionFactory().getStatistics().logSummary();
		Transaction t= s.beginTransaction();
	Employee e=new Employee();
	e.setId(1);
	e.setName("abc");
	e.setSalary(1234);
	s.save(e);
		t.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
