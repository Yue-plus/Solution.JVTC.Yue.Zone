package zone.yue.jvtc.solution.OOP.work3;

import java.util.Scanner;

class R18Exception extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "只有年龄大于等于 18 岁的才允许进行系统";
    }
}

/**
 * 自定义异常，编程实现通过键盘输入登录系统用户的年龄，对用户年龄的合法性进行检查，只有年龄大于等于18岁的才允许进行系统，其余的都不允许进入系统。
 *
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println("请输入年龄：");
        System.out.println(checkR18() ? "允许进入系统" : "不允许进入系统");
    }

    public static boolean checkR18() throws R18Exception {
        var sc = new Scanner(System.in);

        var age = sc.nextShort();
        var isUnder18 = age < 18;

        if (isUnder18) {
            throw new R18Exception();
        }

        return true;
    }
}