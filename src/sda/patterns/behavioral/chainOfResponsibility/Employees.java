package sda.patterns.behavioral.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Employees {

    private Map<String, Integer> companyEmployees;

    public Employees() {
        companyEmployees = new HashMap<>();
    }

    public boolean addEmployee(String newEmployee, int level) { //robimy dodawanie pracownika
        companyEmployees.put(newEmployee, level);
        return true;
    }

    public boolean checkEmployee(String name) {
        return companyEmployees.keySet().contains(name);
    }

    public int checkEmployeeLevel(String name) {
        return companyEmployees.get(name);

    }
}
