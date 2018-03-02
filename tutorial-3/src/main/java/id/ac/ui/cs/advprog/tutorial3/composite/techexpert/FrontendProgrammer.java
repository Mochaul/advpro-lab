package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class FrontendProgrammer extends Employees {
    public FrontendProgrammer(String name, double salary) {
        this.name = name;
        if(salary<30000) throw new IllegalArgumentException();
        this.salary = salary;
        role = "Front End Programmer";
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
