package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * BASIC-28 Huffman 树
 *
 * @author Yue_plus
 */
public class Basic28 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final ArrayList<Integer> arr = new ArrayList<>();
        final int max = sc.nextInt();
        int c = 0;

        for (int i = 0; i < max; i++) {
            arr.add(sc.nextInt());
        }

        while (arr.size() > 2) {
            Collections.sort(arr);

            int temp = arr.get(0) + arr.get(1);
            c += temp;
            arr.set(1, temp);
            arr.remove(0);
        }

        c += arr.get(0) + arr.get(1);

        System.out.println(c);
    }
}
