package TheBasics.day10;

/**
 * 生产者和消费者问题：
 * 两类线程：
 * 生产者和消费者并不关系互相的行为，只关注共享的数据区域。
 * Object的方法：wait（），notify（），notifyAll（）
 */
public class Learning1004 {
    public static void main(String[] args) {
        //生产者和消费者的案例
        Box b = new Box();
        Producer p = new Producer(b);
        Customer c = new Customer(b);
        Thread t1 = new Thread(p,"生产者");
        Thread t2 = new Thread(c,"消费者");
        //启动线程
        t1.start();
        t2.start();
    }
}
