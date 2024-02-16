package org.example.visitor;

public class Developer extends Person implements SalaryAdjuster, PerformanceEvaluator{
    Developer(int id, String name, Double salary, String Evaluation) {
        super(id, name, salary, Evaluation);
    }
}
