package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-4 数列特征
 *
 * @author Yue_plus
 */
public class Basic4 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            final int temp = sc.nextInt();
            min = Math.min(min, temp);
            max = Math.max(max, temp);
            sum += temp;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
