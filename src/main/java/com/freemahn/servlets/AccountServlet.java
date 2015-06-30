package com.freemahn.servlets;

import com.freemahn.DAO.Factory;
import com.freemahn.utils.Statistics;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Freemahn on 26.06.2015.
 */
public class AccountServlet extends HttpServlet {

    /**
     * Handles addAmount(id,value) post request
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Long value = Long.parseLong(request.getParameter("value"));

        Factory.getInstance().getAccountService().addAmount(id, value);
        response.getWriter().write("OK");

        Statistics.addCount++;
    }

    /**
     * Handles getAmount(id) get request
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));

        Long result = Factory.getInstance().getAccountService().getAmount(id);
        response.getWriter().write("" + (result == null ? 0 : result));

        Statistics.getCount++;
    }

}
