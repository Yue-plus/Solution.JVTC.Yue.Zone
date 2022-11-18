package zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse;

/**
 * 老鼠
 *
 * @author Yue_plus
 */
public abstract class AbstractMouse {
    private MouseState state = MouseState.NORMAL;

    /** 查询鼠鼠状态 */
    public MouseState getState() {
        return state;
    }

    /** 设置鼠鼠状态 */
    public void setState(MouseState state) {
        this.state = state;
        MouseState.print(state);
    }

    public void drink() {}
}
