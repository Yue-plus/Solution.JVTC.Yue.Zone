package zone.yue.jvtc.solution.LanQiao.problemsets;

/**
 * BASIC-7 特殊的数字
 *
 * @author Yue_plus
 */
public class Basic7 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i == Math.pow(i / 100, 3) + Math.pow(i % 100 / 10, 3) + Math.pow(i % 100 % 10, 3)) {
                System.out.println(i);
            }
        }
    }
}
