package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-5 查找整数
 *
 * @author Yue_plus
 */
public class Basic5 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        final int f = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (f == arr[i - 1]) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println(-1);
    }
}
