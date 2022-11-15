package zone.yue.jvtc.solution.ProgramDesignBasisC.Work7;

/**
 * 求 1~100 内奇数的和。
 *
 * @author Yue_plus
 */
public class Q2 {
    final int result = 2500;

    public static void main(String[] args) {
        var result = 0;
        var max = 100;

        for (byte i = 1; i <= max; i++) {
            // System.out.print(i + " ");
            if (i % 2 != 0) {
                result += i;
            }
        }

        System.out.println("1~100 内奇数的和为：" + result);
    }
}
