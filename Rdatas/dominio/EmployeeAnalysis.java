package maratonajava.javacore.Rdatas.dominio;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EmployeeAnalysis {
    private Instant timeOfQuery;
    private Period hireInDate;
    private long employeeTotalDays;
    private Duration totalHours;
    private String employeeTicket;

    public void environmentTime(String hireTime){
        LocalDate hireInDate = LocalDate.parse(hireTime);
        LocalDate actuallyDays = LocalDate.now();
        this.hireInDate = Period.between(hireInDate, actuallyDays);
        this.employeeTotalDays = ChronoUnit.DAYS.between(hireInDate, actuallyDays);
        this.totalHours = Duration.ofHours(employeeTotalDays * 8);
        this.timeOfQuery = Instant.now();
    }

    public void printReport(String name){
        System.out.println("Employee name: " + name);
        System.out.println("Environment Time: " + hireInDate);
        System.out.println("Day of work: " + employeeTotalDays);
        System.out.println("Total hours of work: " + totalHours);
        System.out.println("Time of query: " + timeOfQuery);
        System.out.println("EmployeeType: " + employeeTicket);
    }

    public void employeeType(){
        int employeeTime = hireInDate.getYears();
        if (employeeTime <= 1){
            employeeTicket = "Probation period";
        } else if (employeeTime < 5){
            employeeTicket = "Junior employee";
        } else {
            employeeTicket = "Senior employee";
        }
    }
}
