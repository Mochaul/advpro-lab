package id.ac.ui.cs.advprog.tutorial3.composite;

import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Ceo;
import id.ac.ui.cs.advprog.tutorial3.composite.higherups.Cto;
import id.ac.ui.cs.advprog.tutorial3.composite.techexpert.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Ceo ceo = new Ceo("a", 200000);
        Cto cto = new Cto("b", 100000);
        BackendProgrammer backendProgrammer = new BackendProgrammer("c", 20000);
        FrontendProgrammer frontendProgrammer = new FrontendProgrammer("d", 30000);
        NetworkExpert networkExpert = new NetworkExpert("e", 50000);
        SecurityExpert securityExpert = new SecurityExpert("f", 70000);
        UiUxDesigner uiUxDesigner = new UiUxDesigner("g", 90000);

        company.addEmployee(ceo);
        company.addEmployee(cto);
        company.addEmployee(backendProgrammer);
        company.addEmployee(frontendProgrammer);
        company.addEmployee(networkExpert);
        company.addEmployee(securityExpert);
        company.addEmployee(uiUxDesigner);

        for (Employees employee : company.getAllEmployees()) {
            System.out.printf("Role: %-20s, Name: %s, Salary: %.1f%n", employee.getRole(), employee.getName(), employee.getSalary());
        }

        System.out.println();
        System.out.println("Total Salaries: " + company.getNetSalaries());
    }
}
