package AsynchronousCallback_class;

public class Boss {
    private String name;
    private Employee employee;

    public Boss() {
    }

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void assignTask() {
        System.out.println(this.getName() + ", 作为老板, 我要去做个保健了, 你去干活!");
        // 让员工去干活
        employee.doTask();
        System.out.println(this.getName() + ", 作为老板, 我做保健了, 我回来了!");
    }

    public void getTaskResult() {
        System.out.println("完成了任务!");
    }
}
