package sda.patterns.behavioral.chainOfResponsibility;

public class SeniorityLevelCheck extends AccessCheck {

    private static final int REQUIRED_EMPLOYEE_LEVEL = 12;
    private Employees employees;

    public SeniorityLevelCheck(Employees employees) {
        this.employees = employees;
    }

    @Override
    public boolean doCheck(String username) {
        System.out.println("Seniority check for " + username);
//        if(employees.checkEmployeeLevel(username) <12) { - użyty Magic Number, chcemy się go pozbyć
        if(employees.checkEmployeeLevel(username) < REQUIRED_EMPLOYEE_LEVEL) {
            System.out.println(getClass().getCanonicalName() + " check FAILED!");
            return false;
        }
        System.out.println(getClass().getCanonicalName() + " check PASSED for " + username);
        return checkNext(username);
    }




}
