package zone.yue.jvtc.solution.ProgramDesignBasisC.Work11;

/**
 * Q2 - 创建一个 4*4 的二维数组，求该数组矩阵对角线元素之和。
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1,  2,  3,  4},
                { 4,  5,  6,  5},
                { 7,  8,  9,  6},
                {10, 11, 12, 13}
        };

        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            r += arr[i][i];
            r += arr[i][arr[i].length - i - 1];
        }

        System.out.println(r);
    }
}
