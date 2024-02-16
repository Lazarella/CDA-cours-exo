package com.example.tp_hopital.controller.controller;

import com.example.tp_hopital.controller.repository.PatientRepository;
import com.example.tp_hopital.controller.service.PatientService;
import com.example.tp_hopital.controller.utils.HibernateSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


@WebServlet(name = "patient", value = "/patient")
public class PatientServlet extends HttpServlet {

    private PatientService patientService;


    public void init() {
        patientService = new PatientService(HibernateSession.getSessionFactory(), new PatientRepository());
    }

}
