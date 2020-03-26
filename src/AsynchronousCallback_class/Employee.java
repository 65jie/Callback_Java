package AsynchronousCallback_class;

public class Employee {
    private String name;
    private Boss boss;

    public Employee() {
    }

    public Employee(String name, Boss boss) {
        this.name = name;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    // 异步调用
    public void doTask() {
        // 开一个新的线程, 避免阻塞
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // 做具体的业务
                long startTime = System.currentTimeMillis();
                try {
                    System.out.println("我是" + getName() + ", 老板啊! 我在玩命干活中!!!");
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                long costTime = endTime - startTime;
                System.out.println("这个结果是我自己知道的, 但是我不会给老板说! 实际上我花了" + costTime / 1000 + "ms");

                // 回调, 由此可以给出结果!
                boss.getTaskResult();
            }
        };
        new Thread(r).start();
    }
}