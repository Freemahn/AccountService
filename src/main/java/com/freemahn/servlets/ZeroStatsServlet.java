package com.freemahn.servlets;

import com.freemahn.utils.Statistics;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Freemahn on 30.06.15.
 */

/**
 * This servlet's purpose is only set stats to zero, obviously
 */
public class ZeroStatsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Statistics.zeroStats();
        response.sendRedirect("stats.jsp");
    }


}
