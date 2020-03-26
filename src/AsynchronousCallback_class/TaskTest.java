package AsynchronousCallback_class;

public class TaskTest {
    public static void main(String[] args) {
        Boss boss = new Boss("大裤衩");
        Employee employee = new Employee("王二", boss);
        boss.setEmployee(employee);
        boss.assignTask();
        // employee.doTask();
    }
}
