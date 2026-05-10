package maratonajava.javacore.Sformatacao.test;

import java.util.Scanner;

import static maratonajava.javacore.Sformatacao.dominio.AppointmentSchedulingSystem.testAppointment;

public class AppointmentSchedulingSystemTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Day: ");
            int day = scanner.nextInt();
            System.out.print("Month: ");
            int month = scanner.nextInt();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            System.out.print("Appointment Hours of day: ");
            int hour = scanner.nextInt();
            System.out.print("Appointment minute of day: ");
            int minute = scanner.nextInt();
            testAppointment(year, month, day, hour, minute,name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
