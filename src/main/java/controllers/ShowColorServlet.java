package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/showcolor")
public class ShowColorServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/show-color.jsp").forward(req, res);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String userColor = req.getParameter("color");
        req.setAttribute("color", userColor);
    }
}
