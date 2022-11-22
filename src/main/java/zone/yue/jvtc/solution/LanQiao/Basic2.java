package zone.yue.jvtc.solution.LanQiao;

/**
 * BASIC-2	01字串
 *
 * @author Yue_plus
 */
public class Basic2 {
    public static void main(String[] args) {
        // (OTC)31 = (BIN)11111 = (HEX)1F
        byte max = 31;
        for (byte i = 0; i <= max; i++) {
            String bin = String.format("%5s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.print(bin + (i == max ? "" : "\n"));
        }
    }
}
