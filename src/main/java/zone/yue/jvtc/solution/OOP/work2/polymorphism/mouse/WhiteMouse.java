package zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse;

/**
 * 白鼠鼠
 *
 * @author Yue_plus
 */
public class WhiteMouse extends AbstractMouse {
    @Override
    public void drink() {
        System.out.println("白鼠鼠把酒一口喝下。");
        setState(MouseState.SLEEP);
    }
}
