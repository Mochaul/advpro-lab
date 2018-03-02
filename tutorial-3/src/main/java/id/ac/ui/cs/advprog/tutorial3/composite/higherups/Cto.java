package id.ac.ui.cs.advprog.tutorial3.composite.higherups;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class Cto extends Employees {
    public Cto(String name, double salary) {
        this.name = name;
        if(salary<100000) throw new IllegalArgumentException();
        this.salary = salary;
        role = "CTO";
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
