package zone.yue.jvtc.solution.ProgramDesignBasisC.Work8;

/**
 * 使用循环结构设计程序，使其输出以下图形。<br />
 * <img src="https://course.icve.com.cn/learnspace/incoming/editor/zhzj/upload/image/20221121/46791669016379728.png" />
 *
 * @author Yue_plus
 */
public class Q3 {
    public static void main(String[] args) {
        final var max = 4;
        var temp = new StringBuilder();

        for (int i = 1; i <= max; i++) {
            temp.append("*".repeat(i)).append("\n");
        }

        System.out.print(temp);
        temp.reverse().deleteCharAt(0);
        System.out.print(temp);
    }
}
