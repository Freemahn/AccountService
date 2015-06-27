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
        Account account = new Account();
        account.setId(id);//TODO ??
        account.setValue(value);
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(account);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    public Long getAmount(Integer id) {
        Session session = null;
        Account acc = null;
        Long answer = 0l;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
            answer = Long.parseLong(session.createSQLQuery("select value from accounts where id =" + id)
                    .uniqueResult().toString());
            // acc = (Account) session.load(Account.class, id);
            JOptionPane.showMessageDialog(null, "{id=" + id + "}", "Ошибка I/O", JOptionPane.OK_OPTION);


        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return answer;
        //return acc == null ? -1 : acc.getValue() == null ? -2 : acc.getValue();

    }

}
