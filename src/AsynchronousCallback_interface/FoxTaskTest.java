package AsynchronousCallback_interface;

public class FoxTaskTest {
    public static void main(String[] args) {
        FoxBoss boss = new FoxBoss("大裤衩");
        FoxEmployee employee = new FoxEmployee("王二", boss);
        boss.setFoxEmployee(employee);
        boss.assignTask();
    }
}
