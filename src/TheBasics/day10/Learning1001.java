package TheBasics.day10;

/**
 * 进程和线程：
 *  1.线程：进程中的单个顺序控制流
 *  2.单线程：只有一条顺序控制流
 *  3.多线程：有多条执行路径
 *  4.run方法是用来封装被线程执行的代码
 *  5.start（）启动线程，然后由jvm调用此线程的run方法（多线程的第一种实现方式）
 *  6.setName和getName分别设置和得到线程名字；
 *  7.线程调度：java使用抢占式调度模型：抢占cpu占用时间
 */
public class Learning1001 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();//可以在MyThread中重写有参构造在实例化的时候设置名字
        MyThread m2 = new MyThread();
//        m1.run();
//        m2.run();

        //设置线程名字
        m1.setName("线程1");
        m2.setName("线程2");


        //返回正在执行的线程对象的引用
        //System.out.println(Thread.currentThread().getName());

        //得到线程优先级：只能是1-10,默认是5，优先级高不代表一定能够抢占到cpu，只是几率高
        //System.out.println(m1.getPriority());

        //设置线程优先级
        //m1.setPriority(10);
        //System.out.println(m1.getPriority());

        //线程休眠


        //线程等待 void join()等待这个线程死亡
        //m1.start();
        //设置等待
//        try {
//            m1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        //设置主线程，setDaemon将线程设置为守护线程，主线程没了守护线程也应该死亡
        //但不是立即消失
        //Thread.currentThread().setName("zhu");
        //m1.setDaemon(true);//默认为true

        //线程启动
        m1.start();
        m2.start();
    }

}
