package zone.yue.jvtc.solution.OOP.work2.extend;

/**
 * @author Yue_plus
 */
public class StudentTest {
    public static void main(String[] args) {
        var wangFang = new Student("王芳", "女", (short) 18);
        System.out.println(wangFang);

        var zhangFan = new Student("张帆", "男", (short) 22);
        System.out.println(zhangFan);

        var liMing = new GraduateStudent("李明", "男", (short) 27, "计算机", "李华");
        System.out.println(liMing);

        System.out.println("=====初始化结束=====");

        wangFang.addAge();
        System.out.println(wangFang);

        zhangFan.addAge();
        System.out.println(zhangFan);

        System.out.println("=====年龄加一结束=====");

        if (wangFang.isOlder()) {
            System.out.println(wangFang);
        }

        if (zhangFan.isOlder()) {
            System.out.println(zhangFan);
        }

        if (liMing.isOlder()) {
            System.out.println(liMing);
        }

        System.out.println("=====isOlder() 判断结束=====");
    }
}
