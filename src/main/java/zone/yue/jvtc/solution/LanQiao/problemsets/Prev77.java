package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

public class Prev77 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int m = sc.nextInt(), n = sc.nextInt();
        final long[][] arr = new long[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextLong();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[m - j - 1][i] + " ");
            }
            System.out.println();
        }
    }
}
