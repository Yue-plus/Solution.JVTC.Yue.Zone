package zone.yue.jvtc.solution.ProgramDesignBasisC.Work7;

import java.util.ArrayList;

/**
 * 输出 1~200 之间能被 3 和 5 整除的整数，每 5 个一行。
 *
 * @author Yue_plus
 */
public class Q3 {
    public static void main(String[] args) {
        var max = 200;
        var count = 1;

        for (var i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (count < 5) {
                    count++;
                    System.out.print(i + "\t");
                } else {
                    count = 1;
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * <img src="https://jvtc.yue.zone/img/%E2%86%92%E2%86%91%E2%86%90%E2%86%93%E2%86%92%E2%86%91%E2%86%90%E2%86%93%E2%86%92%E2%86%91%E2%86%90%E2%86%93.gif" />
     */
    public static void result() {
        System.out.println("""
                15	30	45	60	75
                90	105	120	135	150
                165	180	195
                """);
    }
}
