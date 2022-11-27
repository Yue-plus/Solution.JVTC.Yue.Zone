package zone.yue.jvtc.solution.LanQiao.problemsets;


import java.util.Scanner;

/**
 * BASIC-02	序列求和
 *
 * @author Yue_plus
 */
public class Basic02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 0;

        for (long i = 1; i <= n; i ++) {
            r += i;
        }

        System.out.println(r);
    }
}
