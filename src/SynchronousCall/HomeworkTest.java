package SynchronousCall;

public class HomeworkTest {
    public static void main(final String[] args) throws InterruptedException {
        final Student student = new Student("张三", 1);
        final Teacher teacher = new Teacher("小小仙女");
        teacher.setStudent(student);
        teacher.assignHomework();
    }
}
