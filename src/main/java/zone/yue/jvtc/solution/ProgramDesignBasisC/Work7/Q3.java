package zone.yue.jvtc.solution.ProgramDesignBasisC.Work7;

import java.util.ArrayList;

/**
 * 输出 1~200 之间能被 3 和 5 整除的整数，每 5 个一行。
 *
 * @author Yue_plus
 */
public class Q3 {
    public static void main(String[] args) {
        var max = 200;
        var count = 1;

        for (var i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (count < 5) {
                    count++;
                    System.out.print(i + "\t");
                } else {
                    count = 1;
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * <img src="https://jvtc.yue.zone/img/%E2%86%92%E2%86%91%E2%86%90%E2%86%93%E2%86%92%E2%86%91%E2%86%90%E2%86%93%E2%86%92%E2%86%91%E2%86%90%E2%86%93.gif" />
     */
    public static void result() {
        System.out.println("""
                3	5	6	9	10
                12	15	18	20	21
                24	25	27	30	33
                35	36	39	40	42
                45	48	50	51	54
                55	57	60	63	65
                66	69	70	72	75
                78	80	81	84	85
                87	90	93	95	96
                99	100	102	105	108
                110	111	114	115	117
                120	123	125	126	129
                130	132	135	138	140
                141	144	145	147	150
                153	155	156	159	160
                162	165	168	170	171
                174	175	177	180	183
                185	186	189	190	192
                195	198	200
                """);
    }
}
