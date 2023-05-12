import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        HttpSession session = request.getSession();
        boolean isLoggedIn = session.getAttribute("username") != null;
        if (!isLoggedIn) {
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.setAttribute("username", request.getParameter("username"));
        session.setAttribute("password", request.getParameter("password"));
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        boolean validLogin = username != null && username.trim() != "" && password != null && password.trim() != "";

        if (validLogin) {
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}