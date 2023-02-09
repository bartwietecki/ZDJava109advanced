package sda.patterns.structural.proxy;

public class PublicCompanyNetwork implements CompanyNetwork {

    private String username;

    public PublicCompanyNetwork(String username) {
        this.username = username;
    }


    @Override
    public void obtainAccess(String username) {
        System.out.println("Granted PUBLIC network access for : " + username);
    }
}
