package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Scanner;

/**
 * BASIC-20 数的读法
 * <p> 参考：
 * <a href="https://www.cnblogs.com/morning-start/articles/16025967.html">BASIC-20 数的读法 - morning-start - 博客园</a>
 *
 * @author Yue_plus
 */
public class Basic20 {
    @SuppressWarnings({"AlibabaUndefineMagicConstant", "AliControlFlowStatementWithoutBraces"})
    public static void main(String[] args) {
        final String[] digit = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };
        final String[] tmp = { "0000", "000", "00", "0" };

        String n = new Scanner(System.in).next();
        final int cnt = n.length() % 4;
        // 把输入的数字拼成 4 的整数倍长度
        n = tmp[cnt] + n;

        StringBuilder ans = new StringBuilder();

        // 记录连续 0 的个数
        int zero = 0;

        // 4 - cnt 可定位到输入数字的第一位
        for (int i = 4 - cnt; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                zero++;
            } else {
                // 遇到第一个非零数字，且有多个连续的 0，且非零数字不在下一组的第一个位置，只需读出一个 0
                if (zero > 0 && i % 4 != 0) ans.append("ling ");
                zero = 0;

                String str = digit[n.charAt(i) - '0'];

                // 千位
                if (i % 4 == 0) ans.append(str).append(" qian ");

                // 百位
                else if (i % 4 == 1) ans.append(str).append(" bai ");

                // 十位
                else if (i % 4 == 2) ans.append(str).append(" shi ");

                //个位
                else ans.append(str).append(" ");
            }

            // 如果位于万位上且这一组的四个数字不全为 0，需要加 "wan"
            if (n.length() - i == 5 && zero < 4) ans.append("wan ");

            // 如果位于亿位上，需要加 "yi"
            else if (n.length() - i == 9) ans.append("yi ");
        }

        // "yi shi" 开头的话要去掉 "yi "
        if (ans.indexOf("yi shi") == 0) ans = new StringBuilder(ans.substring(3, ans.length()));

        System.out.println(ans);
    }
}