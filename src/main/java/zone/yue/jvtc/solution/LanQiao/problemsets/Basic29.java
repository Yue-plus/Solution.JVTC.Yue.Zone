package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BASIC-29 高精度加法
 *
 * @author Yue_plus
 */
public class Basic29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
    }
}
