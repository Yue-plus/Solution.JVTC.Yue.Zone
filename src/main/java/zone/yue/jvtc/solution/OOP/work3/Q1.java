package zone.yue.jvtc.solution.OOP.work3;

import java.util.Scanner;

/**
 * 利用 try/catch 代码块检查用户输入的数据是否是有效地浮点数。如果是，则将其记录下来，否则提示用户重新输入。
 *
 * @author Yue_plus
 */
public class Q1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("请输入一个浮点数：");
            getDoubleNumber();
        }
    }

    public static void getDoubleNumber() {
        var sc = new Scanner(System.in);

        try {
            System.out.println(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("输入错误请重新输入：");
            getDoubleNumber();
        }
    }
}
