





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
	//e.setName("plp	");
	//e.setSalary(1234);
	s.save(e);
		/*Employee e=(Employee) s.get(Employee.class, 1);
		e.setName("rr");*/
		t.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
