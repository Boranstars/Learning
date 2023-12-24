package basicalclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "1919-08-10 11:45:14";
        Date time = format.parse(str);
        System.out.println(time);
        
        String str2 = format.format(1322546345l);
        System.out.println(str2);

        Date now = new Date();
        DateFormat format2 = new SimpleDateFormat("今年第D天,第w周");
        String str3 = format2.format(now);
        System.out.println(str3);

    }
}
