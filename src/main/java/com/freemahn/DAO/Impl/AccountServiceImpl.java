package com.freemahn.DAO.Impl;

/**
 * Created by freeemahn on 27.06.15.
 */

import javax.swing.JOptionPane;

import org.hibernate.Session;
import com.freemahn.persistence.HibernateUtil;
;
import com.freemahn.entity.Account;

public class AccountServiceImpl implements com.freemahn.logic.AccountService {
    public void addAmount(Integer id, Long value) {
        Session session = null;


        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Account acc = (Account) session.get(Account.class, id);
          //  JOptionPane.showMessageDialog(null,acc==null, "Account==null?", JOptionPane.OK_OPTION);
            if (acc == null)
                session.save(new Account(id, value));
            else {
                acc.setValue(acc.getValue() + value);
                session.update(acc);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e, "Error in AddAmount", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    public Long getAmount(Integer id) {
        Session session = null;
        Account acc = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            acc = (Account) session.get(Account.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error in GetAmount", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return acc == null ? null : acc.getValue();
        //return acc == null ? -1 : acc.getValue() == null ? -2 : acc.getValue();

    }

}
