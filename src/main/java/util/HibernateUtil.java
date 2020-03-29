package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = bulidSessionFactory();

    private static SessionFactory bulidSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){return sessionFactory;}
}
