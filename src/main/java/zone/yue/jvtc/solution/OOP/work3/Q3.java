package zone.yue.jvtc.solution.OOP.work3;

/**
 * 村庄旁边有个水库用于干旱时的浇灌，但又不能大于它的储水量，因此，需要监控水量是否超高，如果超出100，抛出异常提示水库水位过高，注意泄洪！
 * 
 * @author Yue_plus
 */
public class Q3 {
    /** 水库最大容量 */
    final byte reservoirMax = 100;

    /** 水库 */
    byte reservoir = 90;

    public static void main(String[] args) throws Exception {
        var reservoir = new Q3();
        for (int i = 0; i < reservoir.reservoirMax; i++) {
            reservoir.storeWater();
        }
    }

    /** 用水 */
    public void useWater() throws Exception {
        if (reservoir >= 1) {
            System.out.println("已用一单位水");
            reservoir--;
        } else {
            throw new Exception("水库干了！");
        }
    }

    /** 存水 */
    public void storeWater() throws Exception {
        if (reservoir > reservoirMax) {
            throw new Exception("水库水位过高，注意泄洪！");
        } else {
            System.out.println("已存一单位水。当前有" + reservoir + "单位水");
            reservoir++;
        }
    }
}
