package com.freemahn;

import com.freemahn.DAO.Impl.AccountServiceImpl;
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
       new AccountServiceImpl().addAmount(1,123l);
    }



}
