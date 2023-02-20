package sda.patterns.behavioral.chainOfResponsibility;

public class Company {

    private Employees employees;
    private AccessCheck accessCheck;

    public Company(Employees employees) {
        this.employees = employees;
    }

    public void setCheck(AccessCheck accessCheck) {
        this.accessCheck = accessCheck;
    }

    public boolean enterRoom(String username) {
        if(accessCheck.doCheck(username)) {
            System.out.println("User " + username + " entered the room");
            return true;
        }
        System.out.println("User " + username + " cannot enter");
        return false;
    }

}