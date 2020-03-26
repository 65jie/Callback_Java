package AsynchronousCallback_interface;

public class FoxEmployee {
    private String name;
    private BossCallback bossCallBack;

    public FoxEmployee() {
    }

    public FoxEmployee(String name, BossCallback bossCallBack) {
        this.name = name;
        this.bossCallBack = bossCallBack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BossCallback getBossCallback() {
        return bossCallBack;
    }

    public void setBossCallback(BossCallback bossCallBack) {
        this.bossCallBack = bossCallBack;
    }

    // 异步调用
    public void doTask() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // 做具体的业务
                long startTime = System.currentTimeMillis();
                try {
                    System.out.println("我是" + getName() + ", 老板啊! 我在玩命干活中!!!");
                    Thread.currentThread().sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long endTime = System.currentTimeMillis();
                long costTime = endTime - startTime;
                System.out.println("这个结果是我自己知道的, 但是我不会给老板说! 实际上我花了" + costTime / 1000 + "ms");

                // 回调, 由此可以给出结果!
                bossCallBack.doEvent();
            }
        };
        new Thread(r).start();
    }
}
