package zone.yue.jvtc.solution.OOP.work2.extend;

/**
 * @author Yue_plus
 */
public class GraduateStudent extends Student {
    private final String speciality;
    private final String teacher;

    public GraduateStudent(String name, String sex, short age, String speciality, String teacher) {
        super(name, sex, age);
        this.speciality = speciality;
        this.teacher = teacher;
    }

    @Override
    public boolean isOlder() {
        return getAge() > 25;
    }

    @Override
    public String toString() {
        return super.toString() + "专业：" + speciality + "\n" + "导师：" + teacher + "\n";

    }
}
