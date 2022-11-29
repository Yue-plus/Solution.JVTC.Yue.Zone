package zone.yue.jvtc.solution.ProgramDesignBasisC.Work9;

import java.util.Scanner;

/**
 * 用数组存储输入的 5 个整数，采用键盘输入，求出数组中的最大元素；
 * 
 * @author Yue_plus
 *
 */
public class Q1 {
	public static void main(String[] args) {
		final var sc = new Scanner(System.in);

		// 要啥数组？
		final var arr = new int[5];

		var max = Integer.MIN_VALUE;
		System.out.println("输入的 5 个整数（空格分隔，回车确认）");
		for (int i = 0; i < 5; i++) {
			var n = sc.nextInt();
			arr[i] = n;
			max = Math.max(max, n);
		}

		System.out.println(max);
	}
}
