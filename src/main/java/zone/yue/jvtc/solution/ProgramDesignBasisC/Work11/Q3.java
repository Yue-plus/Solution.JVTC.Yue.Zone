package zone.yue.jvtc.solution.ProgramDesignBasisC.Work11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Q3 - 定义一个 3 行 4 列的二维数组，逐个从键盘输入值，然后讲矩阵左下角值设置为 0。
 * @author Yue_plus
 */
public class Q3 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        var arr = new int[3][4];

        System.out.println("请输入一个 3 行 4 列的整数矩阵：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        arr[arr.length - 1][0] = 0;

        for (int[] ar : arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
