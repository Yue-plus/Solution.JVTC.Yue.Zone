package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-15 字符串对比
 *
 * @author Yue_plus
 */
public class Basic15 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str1 = scanner.next();
        final String str2 = scanner.next();

        if (str1.length() != str2.length()) {
            System.out.println(1);
        } else if (str1.equals(str2)) {
            System.out.println(2);
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
