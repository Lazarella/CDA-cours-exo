package com.example.exo_1.servlet;

import com.example.exo_1.entities.Produit;
import com.example.exo_1.services.ProduitService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="produitList", value="/produit_list")
public class ProduitServlet extends HttpServlet {
    private List produitList;
    private ProduitService produitService;

    @Override
    public void init() throws ServletException{
        produitList = new ArrayList<>();
        produitService = new ProduitService<>();
        produitList = produitService.findAll();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("produits", produitList);
        req.getRequestDispatcher("produit-list.jsp").forward(req,resp);
    }

}
