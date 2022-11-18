package zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse;

/**
 * 灰鼠鼠
 *
 * @author Yue_plus
 */
public class GrayMouse extends AbstractMouse {
    @Override
    public void drink() {
        System.out.println("灰鼠鼠运动一下，把酒一口喝下。");
        super.setState(MouseState.DANCE);
    }
}
