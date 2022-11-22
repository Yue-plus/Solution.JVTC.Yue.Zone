package zone.yue.jvtc.solution.LanQiao;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * BASIC-1	闰年判断
 *
 * @author Yue_plus
 */
public class Basic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(YearMonth.of(sc.nextInt(), 2).lengthOfMonth() == 29 ? "yes" : "no");
    }
}
