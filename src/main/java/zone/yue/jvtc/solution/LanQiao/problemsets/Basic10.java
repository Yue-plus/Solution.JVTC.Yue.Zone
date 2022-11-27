package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BASIC-10	十进制转十六进制
 *
 * @author Yue_plus
 */
public class Basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        System.out.println(n.toString(16));
    }
}
