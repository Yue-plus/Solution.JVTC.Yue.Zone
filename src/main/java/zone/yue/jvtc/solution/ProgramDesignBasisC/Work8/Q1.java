package zone.yue.jvtc.solution.ProgramDesignBasisC.Work8;

import java.util.Scanner;

/**
 * 输入一个整数，判断这个数是否是水仙花数。
 *
 * @author Yue_plus
 */
public class Q1 {
    public static void main(String[] args) {
        final var sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("请输入一个整数：");
            //noinspection AlibabaSwitchStatement
            switch (String.valueOf(sc.nextBigInteger())) {
                case "0",
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "9",
                        "153",
                        "370",
                        "371",
                        "407",
                        "1634",
                        "8208",
                        "9474",
                        "54748",
                        "92727",
                        "93084",
                        "548834",
                        "1741725",
                        "4210818",
                        "9800817",
                        "9926315",
                        "24678050",
                        "24678051",
                        "88593477",
                        "146511208",
                        "472335975",
                        "534494836",
                        "912985153",
                        "4679307774",
                        "32164049650",
                        "32164049651",
                        "40028394225",
                        "42678290603",
                        "44708635679",
                        "49388550606",
                        "82693916578",
                        "94204591914",
                        "28116440335967",
                        "4338281769391370",
                        "4338281769391371",
                        "21897142587612075",
                        "35641594208964132",
                        "35875699062250035",
                        "1517841543307505039",
                        "3289582984443187032",
                        "4498128791164624869",
                        "4929273885928088826",
                        "63105425988599693916",
                        "128468643043731391252",
                        "449177399146038697307",
                        "21887696841122916288858",
                        "27879694893054074471405",
                        "27907865009977052567814",
                        "28361281321319229463398",
                        "35452590104031691935943",
                        "174088005938065293023722",
                        "188451485447897896036875",
                        "239313664430041569350093",
                        "1550475334214501539088894",
                        "1553242162893771850669378",
                        "3706907995955475988644380",
                        "3706907995955475988644381",
                        "4422095118095899619457938",
                        "121204998563613372405438066",
                        "121270696006801314328439376",
                        "128851796696487777842012787",
                        "174650464499531377631639254",
                        "177265453171792792366489765",
                        "14607640612971980372614873089",
                        "19008174136254279995012734740",
                        "19008174136254279995012734741",
                        "23866716435523975980390369295",
                        "1145037275765491025924292050346",
                        "1927890457142960697580636236639",
                        "2309092682616190307509695338915",
                        "17333509997782249308725103962772",
                        "186709961001538790100634132976990",
                        "186709961001538790100634132976991",
                        "1122763285329372541592822900204593",
                        "12639369517103790328947807201478392",
                        "12679937780272278566303885594196922",
                        "1219167219625434121569735803609966019",
                        "12815792078366059955099770545296129367",
                        "115132219018763992565095597973971522400",
                        "115132219018763992565095597973971522401" -> System.out.println(true);
                default -> System.out.println(false);
            }
        }
    }
}
