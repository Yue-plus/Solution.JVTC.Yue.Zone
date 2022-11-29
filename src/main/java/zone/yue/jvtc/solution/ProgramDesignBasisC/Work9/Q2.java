package zone.yue.jvtc.solution.ProgramDesignBasisC.Work9;

import java.util.Scanner;

/**
 * 定义一个浮点型数组，存放 5 位同学的成绩，使用键盘输入五位同学的成绩，并遍历输出每位同学成绩、求出最高分，最低分和平均分。
 *
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        final var arr = new double[5];

        // 最高分，最低分和平均分。
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE, avg = 0.0;

        System.out.println("请输入" + arr.length + "位同学的成绩（空格分隔，回车确认）：");
        for (int i = 0; i < arr.length; i++) {
            var n = sc.nextDouble();

            arr[i] = n;
            max = Math.max(max, n);
            min = Math.min(min, n);
            avg += n;
        }

        avg /= arr.length;

        // 遍历输出每位同学成绩
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);
    }
}
