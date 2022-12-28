package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BASIC-30 阶乘计算
 *
 * @author Yue_plus
 */
public class Basic30 {
    public static void main(String[] args) {
        final int n = new Scanner(System.in).nextInt();
        BigInteger r = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            r = r.multiply(BigInteger.valueOf(i));
        }

        System.out.println(r);
    }
}
