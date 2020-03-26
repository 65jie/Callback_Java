package AsynchronousCallback_interface;

public class FoxBoss implements BossCallback {
    private String name;
    private FoxEmployee foxEmployee;

    public FoxBoss() {
    }

    public FoxBoss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoxEmployee getFoxEmployee() {
        return foxEmployee;
    }

    public void setFoxEmployee(FoxEmployee foxEmployee) {
        this.foxEmployee = foxEmployee;
    }

    public void assignTask() {
        System.out.println(this.getName() + ", 作为老板, 我要去做个保健了, 你去干活!");
        // 让员工去干活
        foxEmployee.doTask();
        System.out.println(this.getName() + ", 作为老板, 我做保健了, 我回来了!");
    }

    @Override
    public void doEvent() {
        System.out.println("打电话给老板，告知已经完成工作了");
    }
}
