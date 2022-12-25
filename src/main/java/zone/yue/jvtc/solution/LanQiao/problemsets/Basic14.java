package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * BASIC-14	时间转换
 *
 * @author Yue_plus
 */
public class Basic14 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long t = scanner.nextLong();
        final LocalTime localTime = LocalTime.ofSecondOfDay(t);
        System.out.println(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
    }
}
