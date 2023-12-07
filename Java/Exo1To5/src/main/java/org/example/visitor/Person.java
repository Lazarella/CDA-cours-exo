package org.example.visitor;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person implements SalaryAdjuster, PerformanceEvaluator {
    private int id;
    private String name;
    private Double salary;
    private String Evaluation;


    public void accept(EmployeeVisitor employeeVisitor){employeeVisitor.visit(this);}


    @Override
    public void visit(Person person) {

    }
}
