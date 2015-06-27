/**
 * Created by freeemahn on 27.06.15.
 */

package com.freemahn;

import java.math.BigInteger;
import java.sql.SQLException;

import com.freemahn.DAO.Factory;
import com.freemahn.entity.Account;
import com.freemahn.persistence.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;

public class GetMain {

    public static void main(String[] args) throws SQLException {
        System.out.println("Post");
        Account acc = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int id = 123;
            Long answer = Long.parseLong(session.createSQLQuery("select value from accounts where id =" + id)
                    .uniqueResult().toString());

            System.out.println("ANSWER " + answer);
           // acc = (Account) session.load(Account.class, id);
            // session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
//        System.out.println(acc.getValue());
    }
}