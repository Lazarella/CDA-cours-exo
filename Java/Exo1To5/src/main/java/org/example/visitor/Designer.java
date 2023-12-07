package org.example.visitor;

public class Designer extends Person implements PerformanceEvaluator, SalaryAdjuster{
    Designer(int id, String name, Double salary, String Evaluation) {
        super(id, name, salary, Evaluation);
    }
}
