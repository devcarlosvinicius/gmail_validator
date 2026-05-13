package maratonajava.javacore.Rdatas.test;

import maratonajava.javacore.Rdatas.dominio.EmployeeAnalysis;

import java.util.Scanner;

public class EmployeeAnalysisTest {
    public static void main(String[] args) {
        EmployeeAnalysis employee1 = new EmployeeAnalysis();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Employee name: ");
            String name = scanner.nextLine();
            System.out.print("Date of hire(yyyy-MM-dd): ");
            String dateHire = scanner.nextLine();
            employee1.environmentTime(dateHire);
            employee1.employeeType();
            employee1.printReport(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
