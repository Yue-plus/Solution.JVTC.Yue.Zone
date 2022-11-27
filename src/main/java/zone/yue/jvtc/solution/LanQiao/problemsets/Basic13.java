package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BASIC-13	数列排序
 *
 * @author Yue_plus
 */
public class Basic13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
