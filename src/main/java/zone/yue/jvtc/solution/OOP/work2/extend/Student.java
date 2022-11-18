package zone.yue.jvtc.solution.OOP.work2.extend;

/**
 * @author Yue_plus
 */
public class Student {
    public final String schoolName = "九江职业技术学院";

    private static int studentsTotal = 0;
    public static int getStudentsTotal() {
        return studentsTotal;
    }

    private final String name;

    private final boolean sex;
    public String getSex() {
        return sex ? "男" : "女";
    }

    private short age;
    public short getAge() {
        return age;
    }
    public void addAge() {
        age++;
    }
    public boolean isOlder() {
        return age > 20;
    }

    public Student() {
        this.name = "无名氏";
        this.sex = true;
        this.age = 14;

        studentsTotal++;
    }

    public Student(String name, String sex, short age) throws IllegalArgumentException {
        this.name = name;
        this.sex = "男".equals(sex);

        boolean isAgeRange = age >= 14 && age <= 45;
        if (isAgeRange) {
            this.age = age;
        } else {
            // this.age = 14;
            throw new IllegalArgumentException("年龄必须在 14~45 之间！");
        }

        studentsTotal++;
    }

    @Override
    public String toString() {
        return String.format("""
                姓名：%s
                性别：%s
                年龄：%d
                学校：%s
                学校人数：%d
                """, name, getSex(), age, schoolName, getStudentsTotal());
    }
}
