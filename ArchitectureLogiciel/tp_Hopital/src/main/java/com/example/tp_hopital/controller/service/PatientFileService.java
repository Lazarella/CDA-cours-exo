package com.example.tp_hopital.controller.service;

import com.example.tp_hopital.controller.entity.Consultation;
import com.example.tp_hopital.controller.entity.Patient;
import com.example.tp_hopital.controller.entity.PatientFile;
import com.example.tp_hopital.controller.exception.RepositoryException;
import com.example.tp_hopital.controller.repository.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PatientFileService {
    Repository<PatientFile> patientFileRepository;

    SessionFactory sessionFactory;

    public PatientFileService(Repository<PatientFile> patientFileRepository, SessionFactory sessionFactory) {
        this.patientFileRepository = patientFileRepository;
        this.sessionFactory = sessionFactory;
    }

    public boolean createPatientFile(Patient patient, String description, List<Consultation> consultationList) throws RepositoryException {
        Boolean result = false;
        Session session = sessionFactory.openSession();
        patientFileRepository.setSession(session);
        PatientFile patientFile = PatientFile.builder()
                .patient(patient)
                .description(description)
                .consultationList(consultationList)
                .build();
        session.beginTransaction();
        try {
            patientFileRepository.create(patientFile);
            session.getTransaction()
                    .commit();
            result = true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new RepositoryException();
        } finally {
            session.close();
        }
        return result;
    }

}
