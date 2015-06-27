package com.freemahn;

import com.freemahn.entity.Account;
import com.freemahn.persistence.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by freeemahn on 27.06.15.
 */
public class PostMain {
    /**
     * Created by freeemahn on 27.06.15.
     */


    public static void main(String[] args) throws SQLException {
        System.out.println("Post");
        //Account acc = n;
        int id = 123;
        int val = 123;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.createSQLQuery("insert into accounts (id,value) values" +
                    "(" + id + "," + val + ")").executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        if (session != null && session.isOpen()) {
            System.out.println("closing up");
            session.close();
        }

    }

}
