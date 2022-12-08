package zone.yue.jvtc.solution.ProgramDesignBasisC.Work11;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * Q1 - 编写程序将两个有序数组合并，合并后数组依然有序。
 * @author Yue_plus
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        var buff = IntBuffer.allocate(arr1.length + arr2.length);
        buff.put(arr1).put(arr2);

        Arrays.sort(buff.array());

        System.out.println(Arrays.toString(buff.array()));
    }
}
