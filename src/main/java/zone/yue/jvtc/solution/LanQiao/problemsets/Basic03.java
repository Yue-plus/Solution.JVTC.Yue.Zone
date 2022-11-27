package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-03	圆的面积
 *
 * @author Yue_plus
 */
public class Basic03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.7f", Math.PI * Math.pow(r, 2));
    }
}
