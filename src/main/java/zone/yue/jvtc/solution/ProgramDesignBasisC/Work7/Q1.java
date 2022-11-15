package zone.yue.jvtc.solution.ProgramDesignBasisC.Work7;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Q1 - 从键盘分别输入年、月、日，判断这一天是当年的第几天。
 * （完善代码，加上年份，月份，日的合法性判断）
 *
 * @author Yue_plus
 */
public class Q1 {
    private short year = 2000;
    private byte month = 1;
    private byte day = 1;

    public static void main(String[] args) {
        while (true) {
            new Q1();
        }
    }

    public Q1() {
        setYear();
        setMonth();
        setDay();
        print();
    }

    public void setYear() {
        System.out.print("请输入年（整数）：");

        final var sc = new Scanner(System.in);
        try {
            year = sc.nextShort();
        } catch (Exception e) {
            System.out.println("输入错误！" + e.getMessage());
            setYear();
        }

        if (year < 1) {
            System.out.println("输入错误！年份不能小于 1 ！");
            setYear();
        }
    }

    public void setMonth() {
        System.out.print("请输入月（1~12）：");

        final var sc = new Scanner(System.in);
        try {
            month = sc.nextByte();
        } catch (Exception e) {
            System.out.println("输入错误！" + e.getMessage());
            setMonth();
        }

        var notMonth = month < 1 || month > 12;
        if (notMonth) {
            System.out.print("输入错误！");
            setMonth();
        }
    }

    public void setDay() {
        System.out.print("请输入日（1~31）：");

        final var sc = new Scanner(System.in);
        try {
            day = sc.nextByte();
        } catch (Exception e) {
            System.out.println("输入错误！" + e.getMessage());
            setDay();
        }
    }

    public void print() {
        try {
            // 参考：https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
            System.out.println(year + "年" + month + "月" + day + "日是该年的第" + LocalDate.of(year, month, day).getDayOfYear() + "天");
        } catch (Exception e) {
            System.out.println("输入错误！" + e.getMessage());
            new Q1();
        }
        System.out.println("============================");
    }
}
