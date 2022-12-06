package zone.yue.jvtc.solution.ProgramDesignBasisC.Work10;

import java.util.Scanner;

/**
 * Q1 - 输入一个整数，根据整数输出相应行数的杨辉三角。
 *
 * @author Yue_plus
 */
public class Q1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        System.out.println("想要多少行的杨辉三角？（输入整数）：");
        final var nMax = sc.nextInt();

        // 分配三角数组
        int[][] odds = new int[nMax + 1][];
        for (int n = 0; n <= nMax; n++) {
            odds[n] = new int[n + 1];

            // 填充三角数组
            for (int k = 0; k < odds[n].length; k++) {
                // 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }

                odds[n][k] = lotteryOdds;
            }
        }

        // 输出三角数组
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d\t", odd);
            }
            System.out.println();
        }
    }
}
