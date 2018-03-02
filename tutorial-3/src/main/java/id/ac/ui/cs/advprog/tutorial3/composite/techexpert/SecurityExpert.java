package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class SecurityExpert extends Employees {
    public SecurityExpert(String name, double salary) {
        this.name = name;
        if(salary<70000) throw new IllegalArgumentException();
        this.salary = salary;
        role = "Security Expert";
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
