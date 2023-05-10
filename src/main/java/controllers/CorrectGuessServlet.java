package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/correct")
public class CorrectGuessServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/guess-outcome.jsp").forward(req, res);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.getWriter().println("<h1>YOU ARE CORRECT!</h1>");
    }
}
