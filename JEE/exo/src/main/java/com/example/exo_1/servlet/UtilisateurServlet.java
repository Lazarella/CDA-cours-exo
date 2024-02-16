package com.example.exo_1.servlet;

import com.example.exo_1.entities.Produit;
import com.example.exo_1.entities.Utilisateur;
import com.example.exo_1.services.UtilisateurService;
import com.example.exo_1.utils.Definition;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@WebServlet(name = "user", value="/user")
public class UtilisateurServlet extends HttpServlet {

    private UtilisateurService service;

    public void init() {
        service = new UtilisateurService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
                    break;
                case "/delete":
                    deleteUser(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/details":
                    showUser(request, response);
                    break;
//                case "/update":
//                    updateUser(request, response);
//                    break;
                case "/list":
                    listUser(request, response);
                    break;
                default:
                    listUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        request.setAttribute("utilisateurs", service.findAll());
        request.getRequestDispatcher(Definition.VIEW_PATH + "utilisateurs.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(Definition.VIEW_PATH + "form-utilisateur.jsp");
        dispatcher.forward(request, response);
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        if (request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id")));
            Utilisateur utilisateur = (Utilisateur) service.findById(id);
            request.setAttribute("utilisateur", utilisateur);
            request.getRequestDispatcher(Definition.VIEW_PATH + "utilisateur.jsp").forward(request, response);
        } else {
            request.setAttribute("utilisateurs", service.findAll());
            request.getRequestDispatcher(Definition.VIEW_PATH + "utilisateurs.jsp").forward(request, response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {


    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String mail = request.getParameter("mail");
        String mDP = request.getParameter("motDePasse");
        Utilisateur utilisateur = new Utilisateur(nom, prenom, mail, mDP);

        if (service.create(utilisateur)) {
            response.sendRedirect("list");
        } else {
            response.sendRedirect(Definition.VIEW_PATH + "form-utilisateur.jsp");
        }

    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {

    }

    private void showUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        if (request.getParameter("id") != null) {
            int id = Integer.parseInt((request.getParameter("id_user")));
            Utilisateur utilisateur = (Utilisateur) service.findById(id);
            request.setAttribute("utilisateur", utilisateur);
            request.getRequestDispatcher(Definition.VIEW_PATH + "produit.jsp").forward(request, response);
        } else {
            request.setAttribute("produits", service.findAll());
            request.getRequestDispatcher(Definition.VIEW_PATH + "produits.jsp").forward(request, response);
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Utilisateur utilisateur = (Utilisateur) service.findById(id);
        if (utilisateur != null) {
            service.delete(utilisateur);
        }
        response.sendRedirect("list");
    }
    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        request.setAttribute("users", service.findAll());
        request.getRequestDispatcher(Definition.VIEW_PATH+"users.jsp").forward(request,response);
    }


}


