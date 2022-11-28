package zone.yue.jvtc.solution.LanQiao.SimulationCompetition.session14phase2;

import java.util.HashSet;
import java.util.Scanner;

/**
 * <a href="https://jvtc.yue.zone/docs/%E7%AB%9E%E8%B5%9B/%E8%93%9D%E6%A1%A5%E6%9D%AF#q7">Q7</a>
 * - 小蓝有 n 个单词，但是单词中有一些是重复的，请帮小蓝去除重复的单词。
 *
 * @author Yue_plus
 */
public class Q7 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> strings = new HashSet<>();

        for (int i = 0; i < n; i++) {
            strings.add(sc.next());
        }

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
