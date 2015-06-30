package com.freemahn.DAO.Impl;

/**
 * Created by Freemahn on 27.06.15.
 */

import javax.swing.JOptionPane;

import com.freemahn.DAO.AccountService;
import org.hibernate.Session;
import com.freemahn.utils.HibernateUtil;
import com.freemahn.entity.Account;

public class AccountServiceImpl implements AccountService {

    //addAmount's realisation
    public void addAmount(Integer id, Long value) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Account acc = (Account) session.get(Account.class, id);
            if (acc == null)
                session.save(new Account(id, value));
            else {
                acc.setValue(acc.getValue() + value);
                session.update(acc);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error in AddAmount", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    //getAmount's realisation
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

    }

}
