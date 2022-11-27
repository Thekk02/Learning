package TheBasics.day10;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(getName()+":"+i);

            //设置线程休眠，会导致执行时间变慢
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
