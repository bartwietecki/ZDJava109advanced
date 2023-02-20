package sda.patterns.structural.facade;

import java.sql.Connection;

public class FacadeDemoApp {

    public static void main(String[] args) {
        traditionalCall();
        facadeCall();
    }

    /**
     * Tradycyjne korzystanie z klas powoduje że programista "końcowy" używa naszego kodu
     * niekoniecznie wiedząc co i jak używać, robi to "żeby zadziałało", "żeby się kompilowało"
     * itp., niekoniecznie optymalnie, albo zgodnie z założeniami autora kodu do generowania raportów.
     */
    private static void traditionalCall() {
        Connection connection = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator generator = new MySQLReportGenerator();
        generator.generateHtmlReport("Customers", connection);

        System.out.println("==================================");

        connection = OracleReportGenerator.getOracleDBConnection();
        OracleReportGenerator generator1 = new OracleReportGenerator();
        generator1.generateHtmlReport("Cars", connection);
    }

    // zamawianie burgera, i optymalizacja robienia jego -> fasada (ściana z okienkiem, gdzie ktoś nam go poda, a
    // nie sami chodzimy po zapleczu i szukamy składników...

    private static void facadeCall() {
        ReportGeneratorFacade.generateReport(ReportGeneratorFacade.DBType.ORACLE, ReportGeneratorFacade.ReportType.PDF,
                "Customers");
    }
}
