package zone.yue.jvtc.solution.LanQiao.SimulationCompetition.session14phase2;

import java.util.Scanner;

/**
 * <a href="https://jvtc.yue.zone/docs/%E7%AB%9E%E8%B5%9B/%E8%93%9D%E6%A1%A5%E6%9D%AF#q8">Q8</a>
 *
 * @author Yue_plus
 */
public class Q8 {
    public static void main(String[] args) {
        long x = 0, y = 0;

        char[] strArr = new Scanner(System.in).nextLine().toCharArray();
        for (char c : strArr) {
            //noinspection AlibabaSwitchStatement
            switch (c) {
                case 'U' -> x--;
                case 'D' -> x++;
                case 'L' -> y--;
                case 'R' -> y++;
            }
        }

        System.out.println(x + " " + y);
    }
}
