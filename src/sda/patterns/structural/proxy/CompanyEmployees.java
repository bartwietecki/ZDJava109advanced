package sda.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {
    private List<String> employees;

    public CompanyEmployees() {
       employees = new ArrayList<>();
    }

    public boolean isActiveEmployee(String username) {
        return employees.contains(username);
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }
}
