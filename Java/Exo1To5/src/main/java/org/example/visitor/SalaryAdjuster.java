package org.example.visitor;

public interface SalaryAdjuster {
    void accept (EmployeeVisitor employeeVisitor);
}
