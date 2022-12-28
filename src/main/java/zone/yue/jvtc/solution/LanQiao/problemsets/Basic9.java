package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-9	特殊回文数
 *
 * @author Yue_plus
 */
public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 10000; i < 999999; i++) {
            final String str = String.valueOf(i);
            if (new StringBuilder(str).reverse().toString().equals(str)) {
                int r = 0;

                for (char a : str.toCharArray()) {
                    r += Integer.parseInt(String.valueOf(a));
                }

                if (r == n) {
                    System.out.println(i);
                }
            }
        }
    }
}