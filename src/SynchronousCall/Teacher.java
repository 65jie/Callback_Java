package SynchronousCall;

public class Teacher {
    private String name;

    private Student student;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public Teacher(final String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    // 教师给学生布置作业，然后学生做作业
    // public void assignHomework(SynchronousCall.Student s) throws InterruptedException {
    public void assignHomework() throws InterruptedException {
        student.doHomework();
        // 表示普通的调用，会阻塞主线程
        System.out.println("老师" + this.getName() + "我要去逛街了!");
    }
}
