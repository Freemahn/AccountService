
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Freemahn on 26.06.2015.
 */
public class AccountServlet extends HttpServlet implements AccountService{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setStatus(200);
        response.setContentType("text/html");
        response.getWriter().write("<html><head>s</head><body>IT WORKS!</body></html>");
    }

    public Long getAmount(Integer id) {
        return null;
    }

    public void addAmount(Integer id, Long value) {

    }
}
