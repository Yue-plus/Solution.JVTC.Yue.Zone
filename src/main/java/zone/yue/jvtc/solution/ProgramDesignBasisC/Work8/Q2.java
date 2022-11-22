package zone.yue.jvtc.solution.ProgramDesignBasisC.Work8;


/**
 * 求 1~100 内的素数，并输出。
 *
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        // 100 以内的素数
        short[] pn = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (short n: pn) {
            System.out.println(n);
        }
    }
}
