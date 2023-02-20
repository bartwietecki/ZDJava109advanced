package sda.patterns.behavioral.chainOfResponsibility;

public class ChainDemoApp {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Adam", 8);
        employees.addEmployee("Zuzanna", 13);
        employees.addEmployee("Ludwik", 6);
        employees.addEmployee("Renata", 15);
        employees.addEmployee("Paweł", 17);

        AccessCheck check = new CompanyInsiderCheck(employees);
        check.addChainElement(new SeniorityLevelCheck(employees));

        Company company = new Company(employees);
        company.setCheck(check);

        System.out.println("===========================");
        company.enterRoom("Adam");
        System.out.println("===========================");
        company.enterRoom("Renata");
        System.out.println("===========================");
        company.enterRoom("Przemysław");
        System.out.println("===========================");
    }
}
