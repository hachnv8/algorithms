package hackerrank.dsa;

/**
 * Created by HachNV on 26/05/2023
 */
public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:40:22AM";
        timeConversion(s);
        timeConversion("23:01:00AM");
    }

    public static String timeConversion(String s) {
        String format = s.contains("PM") ? "PM" : "AM";
        int n = s.length();
        int hour = Integer.parseInt(s.substring(0, 2));
        String time = "";
        if(format.equals("PM")) {
            if(hour < 12) {
                hour += 12;
                time = hour + s.substring(2, n-2);
            } else {
                time = s.substring(0, n-2);
            }
        }
        if(format.equals("AM")) {
            if(hour >= 12) {
                hour -= 12;
                if(hour == 0) time = "00" + s.substring(2, n-2);
                else time = hour + s.substring(2, n-2);
            } else {
                time = s.substring(0, n-2);
            }
        }
        return time;
    }
}
