package zone.yue.jvtc.solution.LanQiao.SimulationCompetition.session14phase2;

/**
 * <a href="https://jvtc.yue.zone/docs/%E7%AB%9E%E8%B5%9B/%E8%93%9D%E6%A1%A5%E6%9D%AF#q1">Q1</a>
 * - 找到一个大于 2022 的最小数，这个数转换成二进制之后，最低的 6 个二进制为全为 0。
 *
 * @author Yue_plus
 */
public class Q1 {
    public static void main(String[] args) {
        var n = 2022;

        // 将 n 转换为二进制字符串；反转字符串；截取前六位；判断前六位是否为 "000000"
        while (!"000000".equals(new StringBuilder(Integer.toBinaryString(n)).reverse().substring(0, 6))) {
            n++;
            System.out.println(n + " : " + Integer.toBinaryString(n));
        }
    }
}
