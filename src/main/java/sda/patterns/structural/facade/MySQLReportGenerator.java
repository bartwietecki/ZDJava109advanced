package sda.patterns.structural.facade;

import java.sql.Connection;

public class MySQLReportGenerator {

    public static Connection getMySQLDBConnection() {
        System.out.println("Tu łączymy się z bazą MySQL");
        return null;
    }

    public void generatePDFReport(String tableName, Connection connection) {
        System.out.println("Generator raportu PDF");
    }

    public void generateHtmlReport(String tableName, Connection connection) {
        System.out.println("Generator raportu HTML");
    }

}
