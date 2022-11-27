package TheBasics.day10;

public class Box {
    //定义变量，第几瓶奶
    private int milk;
    //定义一个成员变量表示奶箱状态
    private boolean state = false;
    //提供存储牛奶和取牛奶的操作
    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //如果没有牛奶，生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        //修改奶箱状态
        state = true;
        //唤醒其他等待的线程
        notifyAll();
    }
    public synchronized void get(){
        //如果没有牛奶等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        //消费完毕，修改状态
        state = false;
        //唤醒线程
        notifyAll();
    }
}
