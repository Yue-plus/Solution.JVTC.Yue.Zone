package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-3 字母图形
 *
 * @author Yue_plus
 */
public class Basic3 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final char[] charArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(charArr[Math.abs(j - i)]);
            }
            System.out.println();
        }
    }
}
