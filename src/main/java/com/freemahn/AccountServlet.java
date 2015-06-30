package com.freemahn;

import com.freemahn.DAO.Factory;
import com.freemahn.logic.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Freemahn on 26.06.2015.
 */
public class AccountServlet extends HttpServlet implements AccountService {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Long value = Long.parseLong(request.getParameter("value"));
        addAmount(id, value);
        response.getWriter().write("OK");
        Statistics.addCount++;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Long result = getAmount(id);
        response.getWriter().write("" + (result == null ? 0 : result));
        Statistics.getCount++;
    }

    public Long getAmount(Integer id) {

        return Factory.getInstance().getAccountService().getAmount(id);
    }

    public void addAmount(Integer id, Long value) {
        Factory.getInstance().getAccountService().addAmount(id, value);

    }
}
