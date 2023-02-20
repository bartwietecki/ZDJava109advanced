package sda.patterns.behavioral.templateMethod;

public class EmailNewsProvider extends NewsProvider {

    private String email;

    public EmailNewsProvider(String email) {
        this.email = email;
    }

    @Override
    public boolean autohize() {
        return email.contains("@");
    }

    @Override
    public boolean endConnection() {
        return true;
    }
}
