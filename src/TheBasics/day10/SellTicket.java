package TheBasics.day10;

public class SellTicket implements Runnable{
    private int tickets = 100;
    Object obj = new Object();
    //卖票，判断票数，卖完票数减一，要用循环实现一直卖票
    @Override
    public void run() {
    while(true) {
        synchronized (obj) {
            //t1进来后就会将代码锁起来，别的进程就不能进来了，出来后才会把锁释放
            if (tickets > 0) {
                //模拟出票时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
    }
}
