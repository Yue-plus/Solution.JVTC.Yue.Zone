package zone.yue.jvtc.solution.OOP.work2.polymorphism;



import zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse.AbstractMouse;
import zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse.ColorfulMouse;
import zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse.GrayMouse;
import zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse.WhiteMouse;

import java.util.concurrent.*;

/**
 * 主人
 *
 * @author Yue_plus
 */
public class Master {
    /**
     * 参考：
     * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html">
     *     ScheduledExecutorService (Java Platform SE 8 )
     * </a>
     */
    private final ScheduledExecutorService sec = Executors.newSingleThreadScheduledExecutor();

    // 主人养了3只爱喝酒的小老鼠，他们分别是：

    /** 白鼠鼠 */
    private final WhiteMouse whiteMouse;
    public WhiteMouse getWhiteMouse() {
        return whiteMouse;
    }

    /** 灰鼠鼠 */
    private final GrayMouse grayMouse;
    public GrayMouse getGrayMouse() {
        return grayMouse;
    }

    /** 花鼠鼠 */
    private final ColorfulMouse colorfulMouse;
    public ColorfulMouse getColorfulMouse() {
        return colorfulMouse;
    }

    public Master() {
        this.whiteMouse = new WhiteMouse();
        this.grayMouse = new GrayMouse();
        this.colorfulMouse = new ColorfulMouse();
    }

    /** 有一天，主人买来了两瓶好酒。这酒很贵，主人没有喝过，想让三只鼠鼠先试试酒劲有多大。 */
    public void tryWineWithMice () {
        System.out.println("试酒开始");

        feeding(whiteMouse);
        feeding(grayMouse);
        feeding(colorfulMouse);

        System.out.print("又过了一会儿，");
        sec.schedule(() -> {
            reflections(colorfulMouse);
            sec.shutdownNow();
        }, 5, TimeUnit.SECONDS);
    }

    /**
     * 喂鼠鼠嚯酒
     *
     * @param mouse 鼠鼠
     */
    public void feeding(AbstractMouse mouse) {
        System.out.println("=================================");
        System.out.println("主人倒满一杯小酒……");
        mouse.drink();
        reflections(mouse);
    }

    /**
     * 观察鼠鼠后的感受
     *
     * @param mouse 鼠鼠
     */
    public void reflections(AbstractMouse mouse) throws IllegalArgumentException {
        // 阿里巴巴编码规范不认识 Lambda 表达式？
        //noinspection AlibabaSwitchStatement
        switch (mouse.getState()) {
            case NORMAL -> System.out.println("，主人对酒很失望，怎么贵的酒，钱白花了......");
            case SLEEP -> System.out.println("，主人对这酒很满意");
            case DANCE -> System.out.println("，主人感觉这酒还有点浪漫情调");
            case CRAZE -> System.out.println("，主人目瞪口呆");
            default -> throw new IllegalArgumentException();
        }
    }
}
