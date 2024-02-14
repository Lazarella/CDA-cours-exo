package com.example.exo_student.service;

import com.example.exo_student.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@Service
public class StudentServiceImpl implements Repository <Student> {


    private final Map<UUID, Student> students;

    public StudentServiceImpl() {
        students = new HashMap<>();
        Student studentA = Student.builder()
                .id(UUID.randomUUID())
                .firstName("John")
                .lastName("Dorian")
                .mail("john.dorian@gmail.com")
                .age(21)
                .build();
        Student studentB = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Perry")
                .lastName("Cox")
                .mail("perry.cox@gmail.com")
                .age(23)
                .build();
        Student studentC = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Carla")
                .lastName("Espinosa")
                .mail("carla.espinosa@gmail.com")
                .age(22)
                .build();
        Student studentD = Student.builder()
                .id(UUID.randomUUID())
                .firstName("Eliot")
                .lastName("Reed")
                .mail("Eliot.reed@gmail.com")
                .age(19)
                .build();
        students.put(studentA.getId(), studentA);
        students.put(studentB.getId(), studentB);
        students.put(studentC.getId(), studentC);
        students.put(studentD.getId(), studentD);
    }


    @Override
    public void createStudent(Student student) {
       students.put(student.getId(), student);

    }

    @Override
    public Student getStudentGetById(UUID id) {
        return students.get(id);
    }

    @Override
    public Student getStudentByLastName(String str) {
        return students.values().stream().filter(s -> s.getLastName().equals(str)).findFirst().orElse(null);
    }

    @Override
    public List<Student> getAllStudent() {
        return students.values().stream().toList();
    }
}
