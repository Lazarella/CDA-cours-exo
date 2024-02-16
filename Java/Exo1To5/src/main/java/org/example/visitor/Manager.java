package org.example.visitor;

public class Manager extends Person implements PerformanceEvaluator, SalaryAdjuster{
    Manager(int id, String name, Double salary, String Evaluation) {
        super(id, name, salary, Evaluation);
    }


}
