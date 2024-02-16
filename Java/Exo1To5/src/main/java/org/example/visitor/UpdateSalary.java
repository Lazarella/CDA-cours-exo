package org.example.visitor;

public class UpdateSalary implements EmployeeVisitor{
    @Override
    public void visit(Person person) {
        System.out.println("new Salary!");
    }
}
