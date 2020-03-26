package AsynchronousCall;

public class LittleStudent {
    private String name;
    private int age;

    public LittleStudent() {
    }

    public LittleStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 异步调用的关键, 可以防止阻塞发生, 在需要调用的这个方法之中, 新开一个线程, 就可以防止主线程阻塞了
    public void doHomework() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(getName() + "我正在做我的工作");
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 但是此处没有说明做事情的时间, 没有回调的话, 调用者就不就知道任务到底完成了没有!
            }
        });
        t.start();
    }
}
