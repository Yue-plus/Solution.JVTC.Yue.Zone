package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-26 报时助手
 *
 * @author Yue_plus
 */
public class Basic26 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int h = sc.nextInt(), m = sc.nextInt();
        final String[] en = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
        };

        if (h < en.length) {
            System.out.print(en[h] + " ");
        } else {
            System.out.print(en[20] + " " + en[h % 20] + " ");
        }

        if (m == 0) {
            System.out.println("o'clock");
        } else if (m < en.length) {
            System.out.println(en[m]);
        } else if (m > 50) {
            System.out.println("fifty " + en[m % 10]);
        } else if (m > 40) {
            System.out.println("forty " + en[m % 10]);
        } else if (m > 30) {
            System.out.println("thirty " + en[m % 10]);
        } else {
            System.out.println(en[20] + " " + en[m % 10]);
        }
    }
}
