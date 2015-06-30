package com.freemahn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by freeemahn on 30.06.15.
 */

public class StatsServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Statistics.zeroStats();
            response.sendRedirect("stats.jsp");
        }


}
