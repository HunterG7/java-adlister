package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/createPost")
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/createPost.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String post = req.getParameter("post");
        req.setAttribute("post", post);
        req.getRequestDispatcher("/createPost.jsp").forward(req, res);
    }

}
