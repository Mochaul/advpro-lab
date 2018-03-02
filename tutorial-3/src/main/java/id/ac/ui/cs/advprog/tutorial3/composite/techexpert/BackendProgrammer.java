package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class BackendProgrammer extends Employees {
    //TODO Implement
    public BackendProgrammer(String name, double salary) {
        this.name = name;
        if(salary<20000) throw new IllegalArgumentException();
        this.salary = salary;
        role = "Back End Programmer";
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
