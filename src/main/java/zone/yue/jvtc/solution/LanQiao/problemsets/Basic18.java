package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * BASIC-18 矩形面积交
 *
 * @author Yue_plus
 */
public class Basic18 {
    public static void main(String[] args) {
        // 参考：https://www.cnblogs.com/AllenMi/p/13377788.html
        final Scanner sc = new Scanner(System.in);
        final BigDecimal
                ax1 = sc.nextBigDecimal(), ay1 = sc.nextBigDecimal(),
                ax2 = sc.nextBigDecimal(), ay2 = sc.nextBigDecimal(),
                bx1 = sc.nextBigDecimal(), by1 = sc.nextBigDecimal(),
                bx2 = sc.nextBigDecimal(), by2 = sc.nextBigDecimal(),
                hx1 = ax1.min(ax2).max(bx1.min(bx2)),
                hy1 = ay1.min(ay2).max(by1.min(by2)),
                hx2 = ax1.max(ax2).min(bx1.max(bx2)),
                hy2 = ay1.max(ay2).min(by1.max(by2));

        if (hx1.compareTo(hx2) > 0 || hy1.compareTo(hy2) > 0) {
            System.out.println("0.00");
        } else {
            System.out.println(hx2.subtract(hx1).abs()
                    .multiply(hy2.subtract(hy1).abs())
                    .setScale(2, RoundingMode.HALF_UP));
        }
    }
}
