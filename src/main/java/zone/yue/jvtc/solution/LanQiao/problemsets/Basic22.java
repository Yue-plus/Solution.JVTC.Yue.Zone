package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-22 FJ的字符串
 *
 * @author Yue_plus
 */
public class Basic22 {
    public static void main(String[] args) {
        final int n = new Scanner(System.in).nextInt();
        final StringBuilder str = new StringBuilder("A");
        char c = 'B';

        for (int i = 1; i < n; i++) {
            String temp = str.toString();
            str.append(c).append(temp);
            c++;
        }

        System.out.println(str);
    }
}
