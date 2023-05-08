import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        hitCount = 0;
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        hitCount++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (reset != null){
            init();
            out.println("<h1>Page click count reset to 0.</h1>");
        } else {
            out.println("<h1>Page Click Count: " + hitCount + "</h1>");
        }
    }
}
