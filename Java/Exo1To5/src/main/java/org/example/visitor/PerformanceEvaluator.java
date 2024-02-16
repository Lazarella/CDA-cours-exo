package org.example.visitor;

public interface PerformanceEvaluator extends EmployeeVisitor{

    public void accept(EmployeeVisitor employeeVisitor);
}
