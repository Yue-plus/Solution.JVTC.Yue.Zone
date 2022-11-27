package zone.yue.jvtc.solution.LanQiao.SimulationCompetition.session14phase2;

/**
 * <a href="https://jvtc.yue.zone/docs/%E7%AB%9E%E8%B5%9B/%E8%93%9D%E6%A1%A5%E6%9D%AF#q3">Q3</a>
 * - 8518 是一个非常特殊的数，如果把这个数看成 16 进制数，它的值为 (8518)16=8*16*16*16+5*16*16+1*16+8=34072，而 34072 正好是 8518 的整数倍。
 * 9558 也是这样一个数，当看成 16 进制时是 38232。 其实长度为 1 的数 0 到 9 都满足看成 16 进制后是自己的整数倍（1 倍）。
 * 请问，除开长度为 1 的数，最小的满足这样条件的数是多少？
 *
 * @author Yue_plus
 */
public class Q3 {
    public static void main(String[] args) {
        var n = 10;

        while (Integer.parseInt(String.valueOf(n), 16) % n != 0) {
            n++;
        }

        System.out.println("(HEX)" + Integer.parseInt(String.valueOf(n), 16) + " : " + "(DEC)" + n);
    }
}
