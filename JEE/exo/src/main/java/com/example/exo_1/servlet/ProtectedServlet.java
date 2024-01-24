package com.example.exo_1.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="protected", value="/protected")
public class ProtectedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        boolean logged = (session.getAttribute("isLogged")!=null) ? (boolean) session.getAttribute("isLogged") :false;

        if(!logged){
            out.println("<div> Pas connecté </div>");
        }else{
            out.println("<div>Connecté</div>");
        }
        out.println("</body></html>");
    }
}
