package AsynchronousCall;

public class EnglishHomeworkTest {
    public static void main(String[] args) {
        EnglishTeacher teacher = new EnglishTeacher("小仙女儿");
        LittleStudent student = new LittleStudent("王二麻子", 7);
        teacher.setStudent(student);
        // 调用
        teacher.assignHomework();
    }
}
