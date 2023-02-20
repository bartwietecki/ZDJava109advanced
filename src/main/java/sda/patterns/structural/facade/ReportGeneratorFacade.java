package sda.patterns.structural.facade;

import java.sql.Connection;

public class ReportGeneratorFacade {

    public static void generateReport(DBType dbType, ReportType reportType, String tableName) {
        Connection connection = null;
        switch (dbType) {
            case ORACLE:
                connection = OracleReportGenerator.getOracleDBConnection();
                OracleReportGenerator generator = new OracleReportGenerator();
                switch (reportType) {
                    case PDF:
                        generator.generatePDFReport(tableName, connection);
                        break;
                    case HTML:
                        generator.generateHtmlReport(tableName, connection);
                        break;
                }
                break;
            case MY_SQL:
                connection = MySQLReportGenerator.getMySQLDBConnection();
                MySQLReportGenerator generator1 = new MySQLReportGenerator();
                switch (reportType) {
                    case PDF:
                        generator1.generatePDFReport(tableName, connection);
                        break;
                    case HTML:
                        generator1.generateHtmlReport(tableName, connection);
                        break;
                }
                break;
        }


    }

    public enum DBType {
        ORACLE,
        MY_SQL
    }

    public enum ReportType {
        HTML,
        PDF
    }
}
