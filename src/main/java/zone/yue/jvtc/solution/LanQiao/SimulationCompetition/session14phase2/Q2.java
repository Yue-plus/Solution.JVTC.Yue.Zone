package zone.yue.jvtc.solution.LanQiao.SimulationCompetition.session14phase2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <a href="https://jvtc.yue.zone/docs/%E7%AB%9E%E8%B5%9B/%E8%93%9D%E6%A1%A5%E6%9D%AF#q2">Q2</a>
 * 请问从 1949 年 10 月 1 日至 2022 年 1 月 1 日经过了多少天？
 *
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        final var start = LocalDate.of(1949, 10, 1);
        final var end = LocalDate.of(2022, 1, 1);

        // 26390 天
        System.out.print(ChronoUnit.DAYS.between(start, end));
    }
}
