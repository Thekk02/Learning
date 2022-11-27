package TheBasics.day10;

/**
 * 多线程的实现方式：
 * 通过实现Runnable接口实现多线程:避免了java单继承的局限性
 * 适合多个相同程序的代码去处理同一个资源的情况。
 * 把线程和程序的代码与数据较好分离，体现面向对象
 *
 * 给代码块上锁避免多线程安全问题：
 *  出现安全问题条件：多线程，数据共享，多条语句操作数据
 *  解决synchronized(Object obj){}同步代码块
 *  好处：解决多线程安全问题
 *  弊端：当线程多时，线程判断同步锁，会浪费资源。
 *  解决2：同步方法可以将synchronized修饰方法：
 *      写法：private synchornizede void sellTicket，同步方法锁的对象是this
 *      同步静态方法：private static synchornized void sellTIcket
 *
 */
public class Learning1002 {
    public static void main(String[] args) {
//        MyRunnable my = new MyRunnable();
//        Thread t1 = new Thread(my,"高铁");
//        Thread t2 = new Thread(my,"飞机");
//        //启动
//        t1.start();
//        t2.start();


        //卖票案例
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
