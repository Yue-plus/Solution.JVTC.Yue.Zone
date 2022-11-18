package zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 花鼠鼠
 *
 * @author Yue_plus
 */
public class ColorfulMouse extends AbstractMouse {
    /**
     * 参考：
     * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html">
     *     ScheduledExecutorService (Java Platform SE 8 )
     * </a>
     */
    @SuppressWarnings("AlibabaThreadPoolCreation")
    private final ScheduledExecutorService sec = Executors.newSingleThreadScheduledExecutor();

    @Override
    public void drink() {
        System.out.println("小花鼠看了看，把酒一口喝下。");
        MouseState.print(super.getState());

        // 1 秒后准备干猫！
        sec.schedule(() -> {
            setState(MouseState.CRAZE);
            sec.shutdownNow();
        }, 1, TimeUnit.SECONDS);
    }
}
