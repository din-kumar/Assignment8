package Anudip.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.confi.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Teacher t1 = new Teacher();
        t1.setT_id(12);
        t1.setT_name("Marudula");
        
        course c1 = new course();
        c1.setC_id(1);
        c1.setC_name("java programming");
        c1.setTeacher(t1);
        
        course c2 = new course();
        c2.setC_id(2);
        c2.setC_name("python programming");
        c2.setTeacher(t1);
        
        course c3 = new course();
        c3.setC_id(3);
        c3.setC_name("Angular programming");
        c3.setTeacher(t1);
        List<course> l1 = new ArrayList();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        
        
        t1.setC(l1);
        Session s= factory.openSession();
        Transaction txt = s.beginTransaction();
        s.save(t1);
        s.save(c1);
        s.save(c2);
        s.save(c3);
        txt.commit();
        s.close();
           
        
    }
}