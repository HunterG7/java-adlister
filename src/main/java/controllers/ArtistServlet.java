package controllers;

import dao.Artists;
import dao.ArtistsDao;
import models.Artist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "ArtistServlet", urlPatterns = "/artists")
public class ArtistServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Artists artistsDao = new ArtistsDao();
        List<Artist> artists = artistsDao.all();
        request.setAttribute("artists", artists);
        request.getRequestDispatcher("artist.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
