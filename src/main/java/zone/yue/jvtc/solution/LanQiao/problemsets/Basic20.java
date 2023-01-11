package zone.yue.jvtc.solution.LanQiao.problemsets;

import java.util.Arrays;
import java.util.Scanner;

/**
 * BASIC-20 数的读法
 *
 * @author Yue_plus
 */
public class Basic20 {
    @SuppressWarnings({"AlibabaUndefineMagicConstant", "AliControlFlowStatementWithoutBraces"})
    public static void main(String[] args) {
        // 输入值最大二十亿（2,000,000,000）
        final int n = new Scanner(System.in).nextInt();
        // 数字长度，从零开始数。
        final int nLength = String.valueOf(n).length() - 1;

        final char[] nArr = String.valueOf(n).toCharArray();

        int i = 0;
        //noinspection AlibabaSwitchStatement
        switch (nLength) {
            case 9:
                if (nArr[i] > '2') System.out.print(readNumber(nArr[i]));
                System.out.print("shi ");
                i++;
            case 8:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "yi ");
                i++;
            case 7:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "qian ");
                i++;
            case 6:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "bai ");
                i++;
            case 5:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "shi ");
                i++;
            case 4:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]));
                System.out.print("wan ");
                i++;
            case 3:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "qian ");
                i++;
            case 2:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "bai ");
                i++;
            case 1:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]) + "shi ");
                i++;
            case 0:
                if (nArr[i] > '0') System.out.print(readNumber(nArr[i]));
        }
        System.out.println();
    }

    /**
     * 读单个数字
     *
     * @param c 整数 0~9
     * @return 数字读法
     */
    private static String readNumber(char c) {
        //noinspection AlibabaSwitchStatement
        switch (c) {
            case '0':
                return "ling ";
            case '1':
                return "yi ";
            case '2':
                return "er ";
            case '3':
                return "san ";
            case '4':
                return "si ";
            case '5':
                return "wu ";
            case '6':
                return "liu ";
            case '7':
                return "qi ";
            case '8':
                return "ba ";
            case '9':
                return "jiu ";
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }
    }
}
