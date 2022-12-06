package zone.yue.jvtc.solution.ProgramDesignBasisC.Work10;

/**
 * Q2 - 采用二维数组实现矩阵的转置
 *
 * @author Yue_plus
 */
public class Q2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12}
        };
        var newArr = new int[arr[0].length][arr.length];

        System.out.println("当前数组为：");
        for (int[] ar: arr) {
            for (int a: ar) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }

        // 转置数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        System.out.println("转置后的数组：");
        for (int[] newAr : newArr) {
            for (int newA : newAr) {
                System.out.print(newA + "\t");
            }
            System.out.println();
        }
    }
}
