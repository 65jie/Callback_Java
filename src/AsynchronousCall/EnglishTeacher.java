package AsynchronousCall;

public class EnglishTeacher {
    private String name;
    private LittleStudent student;

    public EnglishTeacher() {
    }

    public EnglishTeacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LittleStudent getStudent() {
        return student;
    }

    public void setStudent(LittleStudent student) {
        this.student = student;
    }

    /**
     * 布置作业
     */
    public void assignHomework() {
        System.out.println(student.getName() + "你去做你的作业, 现在立刻!");
        // 异步调用
        student.doHomework();
        System.out.println("哈哈, 因为我作为一个老师, 要去逛街了!");
    }
}
