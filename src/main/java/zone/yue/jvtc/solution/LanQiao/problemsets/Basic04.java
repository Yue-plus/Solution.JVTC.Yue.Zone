package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-04	Fibonacci 数列
 *
 * @author Yue_plus
 */
public class Basic04 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;

        int n = new Scanner(System.in).nextInt();
        if (n < 3) {
            System.out.println(1);
            return;
        }

        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            //第三个数等于前两个数之和
            f3 = (f1 + f2) % 10007;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }
}
