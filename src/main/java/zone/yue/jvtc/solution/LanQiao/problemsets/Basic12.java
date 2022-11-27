package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * BASIC-12	十六进制转八进制
 *
 * @author Yue_plus
 */
public class Basic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextBigInteger(16);
        }

        for (BigInteger i : arr) {
            System.out.println(i.toString(8));
        }
    }
}
