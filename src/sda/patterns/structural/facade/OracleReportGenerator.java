package sda.patterns.structural.facade;

import java.sql.Connection;

public class OracleReportGenerator {

    public static Connection getOracleDBConnection() {
        System.out.println("Tu łączymy się z bazą Oracle");
        return null;
    }

    public void generatePDFReport(String tableName, Connection connection) {
        System.out.println("Generator raportu PDF");
    }

    public void generateHtmlReport(String tableName, Connection connection) {
        System.out.println("Generator raportu HTML");
    }


}
