package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-16 分解质因数
 *
 * @author Yue_plus
 */
public class Basic16 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            pff(i);
        }
    }

    /**
     * 分解质因数（Decomposition prime factor）
     * 将结果输出到控制台。
     *
     * @param n 整数
     */
    private static void pff(int n) {
        System.out.print(n + "=");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && n != i) {
                n /= i;
                System.out.print(i + "*");
            }
            if (n == i) {
                System.out.print(i);
                break;
            }
        }
        System.out.println();
    }
}
