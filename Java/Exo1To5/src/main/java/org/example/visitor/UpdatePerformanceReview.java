package org.example.visitor;

public class UpdatePerformanceReview implements EmployeeVisitor{
    @Override
    public void visit(Person person) {
        System.out.println("New performance review!");
    }
}
