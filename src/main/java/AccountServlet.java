
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Freemahn on 26.06.2015.
 */
public class AccountServlet extends HttpServlet implements AccountService {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    static long i = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setStatus(200);
        response.setContentType("text/html");

        Integer id = Integer.parseInt(request.getParameter("id"));
        response.getWriter().write("<html><head>Result = </head><body><b>"
                + getAmount(id) + "</b></body></html>");
    }

    public Long getAmount(Integer id) {
        return i++;
    }

    public void addAmount(Integer id, Long value) {

    }
}
