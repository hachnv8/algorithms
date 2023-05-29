package hackerrank.java;

import java.util.Calendar;

/**
 * Created by HachNV on 25/05/2023
 */
public class DateAndTime {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int month = 8;
        int day = 5;
        int year = 2015;
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String s = "";
        switch (dayOfWeek) {
            case 1:
                s = "MONDAY";
                break;
            case 2:
                s = "TUESDAY";
                break;
            case 3:
                s = "WEDNESDAY";
                break;
            case 4:
                s = "THURSDAY";
                break;
            case 5:
                s = "FRIDAY";
                break;
            case 6:
                s = "SATURDAY";
                break;
            case 7:
                s = "SUNDAY";
                break;
        }
        System.out.println(s);
    }
}
