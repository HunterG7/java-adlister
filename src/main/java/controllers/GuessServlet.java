package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String userGuess = req.getParameter("guess");
        req.setAttribute("guess", userGuess);
        req.getRequestDispatcher("/guess.jsp").forward(req, res);
    }
}
