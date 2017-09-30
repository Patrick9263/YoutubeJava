package Videos40to45;
import java.util.Date;
import java.text.*;

public class DateAndTime {

    private static String hours12(int x){
        String zero = "0";
        if ((x == 0) || (x == 12)) {
            return "12";
        } else {
            if (x < 12) {
                return zero + x;
            }
            else {
                    return String.valueOf("0"+(x - 12));
                }
        }
    }
    private static String minutes00(int x){
        String zero = "0";
        if (x < 10) {
            return zero + x;
        } else {
            return String.valueOf(x);
        }
    }
    private static String seconds00(int x){
        String zero = "0";
        if (x < 10) {
            return zero + x;
        } else {
            return String.valueOf(x);
        }
    }
    private static String amPm(int x){
        String am = "AM";
        String pm = "PM";
        if (x < 12) {
            return am;
        } else {
            return pm;
        }
    }

    public static void main(String[] args) {
        Date dateEx = new Date();
        //System.out.println(dateEx.toString());

        String hours = (hours12(dateEx.getHours()));
        String minutes = (minutes00(dateEx.getMinutes()));
        String seconds = (seconds00(dateEx.getSeconds()));
        String Am = amPm(dateEx.getHours());
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String time = (hours + ":" + minutes + ":" + seconds + " " + Am);
        String dayOfWeek = weekDays[dateEx.getDay()];
        String month = months[dateEx.getMonth()];
        String day = Integer.toString(dateEx.getDate());
        String year = Integer.toString(dateEx.getYear() + 1900);
        System.out.println(dayOfWeek + " " + month + " " + day + ", " + year + "  " + time);

        //Easier Way!!!!!
        SimpleDateFormat date2 = new SimpleDateFormat("EEEE MMMM dd, yyyy  hh:mm:ss a");
        System.out.println(date2.format(dateEx));

    }

}
