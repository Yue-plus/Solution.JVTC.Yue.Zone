package zone.yue.jvtc.solution.LanQiao.problemsets;

/**
 * BASIC-8 回文数
 *
 * @author Yue_plus
 */
public class Basic8 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                System.out.println(i);
            }
        }
    }
}
