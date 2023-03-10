package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Prev280 {
    public static void main(String[] args) {
        final long t = new Scanner(System.in).nextLong();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        System.out.println(simpleDateFormat.format(new Date(t)));
    }
}
