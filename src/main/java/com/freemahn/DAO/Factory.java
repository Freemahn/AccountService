package com.freemahn.DAO;

/**
 * Created by Freemahn on 27.06.15.
 */

import com.freemahn.DAO.Impl.AccountServiceImpl;

/**
 * Singleton for AccountService
 */
public class Factory {

    private static AccountService accountService = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AccountService getAccountService() {
        if (accountService == null) {
            accountService = new AccountServiceImpl();
        }
        return accountService;
    }
}