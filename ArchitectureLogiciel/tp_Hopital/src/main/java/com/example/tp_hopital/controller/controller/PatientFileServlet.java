package com.example.tp_hopital.controller.controller;

import com.example.tp_hopital.controller.repository.PatientFileRepository;
import com.example.tp_hopital.controller.service.PatientFileService;
import com.example.tp_hopital.controller.utils.HibernateSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "patient-file", value = "/patient-file")
public class PatientFileServlet extends HttpServlet {
    private PatientFileService patientFileService;

public   void init(){
    patientFileService = new PatientFileService(new PatientFileRepository(), HibernateSession.getSessionFactory());
}
}
