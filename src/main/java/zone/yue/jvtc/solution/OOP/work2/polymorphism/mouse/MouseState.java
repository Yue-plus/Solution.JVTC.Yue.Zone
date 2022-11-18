package zone.yue.jvtc.solution.OOP.work2.polymorphism.mouse;

/**
 * 鼠鼠状态
 *
 * @author Yue_plus
 */
public enum MouseState {
    /** 正常 */
    NORMAL,

    /** 睡着了 */
    SLEEP,

    /** 脸色微红，不一会就开始跳舞 */
    DANCE,

    /** 准备干猫 */
    CRAZE;

    public static void print(MouseState state) {
        // 阿里巴巴编码规范不认识 Lambda 表达式？
        // noinspection AlibabaSwitchStatement
        switch (state) {
            case NORMAL -> System.out.print("鼠鼠没什么反应");
            case SLEEP -> System.out.print("鼠鼠睡着了");
            case DANCE -> System.out.print("鼠鼠脸色微红，不一会就开始跳舞");
            case CRAZE -> System.out.print("鼠鼠找了一块板砖，眼睛布满血丝，晃晃悠悠的走到主人面前说到猫呢他在欺负我没，看我不拍死丫的");
            default -> throw new IllegalArgumentException();
        }
    }
}
