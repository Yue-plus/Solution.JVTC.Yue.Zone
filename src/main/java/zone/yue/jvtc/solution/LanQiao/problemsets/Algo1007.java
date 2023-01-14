package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * ALGO-1007 印章
 *
 * <p>参考：
 * <a href="https://www.jianshu.com/p/cd2720446a9e">动态规划——印章问题（Java实现） - 简书</a>
 *
 * @author Yue_plus
 */
public class Algo1007 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt(), m = sc.nextInt();
        final double[][] dp = new double[m + 1][n + 1];

        if (n == 1) {
            dp[m][n] = 1;
            System.out.printf("%.4f", dp[m][n]);
            return;
        }

        if (n > 1 && m < n) {
            dp[m][n] = 0;
            System.out.printf("%.4f", dp[m][n]);
            return;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j) {
                    dp[i][j] = 0;
                }
                if (j == 1) {
                    dp[i][j] = Math.pow((1.0 / n), (i - 1));
                } else {
                    dp[i][j] = dp[i - 1][j] * (j * 1.0 / n) + dp[i - 1][j - 1] * ((n - j + 1) * 1.0 / n);
                }
            }
        }

        System.out.printf("%.4f", dp[m][n]);
    }
}
