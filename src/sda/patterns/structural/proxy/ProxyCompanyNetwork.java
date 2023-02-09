package sda.patterns.structural.proxy;

public class ProxyCompanyNetwork implements CompanyNetwork {

    CompanyNetwork companyNetwork;
    CompanyEmployees companyEmployees;

    public ProxyCompanyNetwork(CompanyEmployees employees) {
        this.companyEmployees = employees;
    }

    @Override
    public void obtainAccess(String username) {
        if(isEmployee(username)) {
            companyNetwork = new PrivateCompanyNetwork(username);
        } else {
            companyNetwork = new PublicCompanyNetwork(username);
        }
        companyNetwork.obtainAccess(username);
    }

    private boolean isEmployee(String username) {
        return companyEmployees.isActiveEmployee(username);
    }
}
