package sda.patterns.behavioral.chainOfResponsibility;

public class CompanyInsiderCheck extends AccessCheck {

    private Employees employees;

    public CompanyInsiderCheck(Employees employees) {
        this.employees = employees;
    }


    @Override
    public boolean doCheck(String username) {
        System.out.println("Company Insider check for " + username);
        if(!employees.checkEmployee(username)) {
            System.out.println(getClass().getCanonicalName() + " check FAILED!");
            return false;
        }
        System.out.println("Company Insider check PASSED for " + username);
        return checkNext(username);
    }
}
