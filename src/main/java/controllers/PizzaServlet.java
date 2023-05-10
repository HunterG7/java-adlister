package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet ("/pizza-order")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);
    }

    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String userCrust = req.getParameter("crust"),
                userSauce = req.getParameter("sauce"),
                userSize = req.getParameter("size"),
                userAddress = req.getParameter("address");
        String[] userToppings = req.getParameterValues("toppings");
        req.setAttribute("crust", userCrust);
        req.setAttribute("sauce", userSauce);
        req.setAttribute("size", userSize);
        req.setAttribute("address", userAddress);
        req.setAttribute("toppings", userToppings);

        req.getRequestDispatcher("/pizza-order.jsp").forward(req, res);
    }
}
