package zone.yue.jvtc.solution.LanQiao;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BASIC-11	十六进制转十进制
 *
 * @author Yue_plus
 */
public class Basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(16);
        System.out.println(n.toString());
    }
}
