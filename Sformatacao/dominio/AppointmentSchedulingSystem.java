package maratonajava.javacore.Sformatacao.dominio;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AppointmentSchedulingSystem {
    public static void testAppointment(int year, int month, int day, int hour, int minute, String name) throws Exception {
        month--;
        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, minute);
        Date date = c.getTime();
        if (date.before(new Date())) {
            throw new InvalidDateException("Invalid Date");
        }
        DateFormat[] dateFormat1 = new DateFormat[3];
        dateFormat1[0] = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault());
        dateFormat1[1] = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        dateFormat1[2] = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
        DateFormat[] dateFormatHour = new DateFormat[3];
        dateFormatHour[0] = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.getDefault());
        dateFormatHour[1] = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.US);
        dateFormatHour[2] = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.ITALY);
        int index = 0;
        for (DateFormat dateFormatCountry : dateFormat1) {
            StringBuilder sb = new StringBuilder();
            sb.append("--- Checked Appointment ---");
            sb.append("\n");
            sb.append("Patient: ").append(name).append("\n");
            sb.append("Appointment Day:").append(dateFormatCountry.format(date));
            sb.append("\n");
            sb.append("Appointment Start: ").append(dateFormatHour[index].format(date));
            sb.append("\n");
            c.add(Calendar.MINUTE, 30);
            date = c.getTime();
            sb.append("Appointment Ends: ").append(dateFormatHour[index].format(date));
            System.out.println(sb);
            c.add(Calendar.MINUTE, -30);
            date = c.getTime();
            index++;
        }
    }
}
