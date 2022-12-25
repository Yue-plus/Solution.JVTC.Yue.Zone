package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-6 杨辉三角形
 *
 * @author Yue_plus
 */
public class Basic6 {
    public static void main(String[] args) {
        final int n = new Scanner(System.in).nextInt();
        final long[][] arr = new long[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                    System.out.print(1 + " ");
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j -1];
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
