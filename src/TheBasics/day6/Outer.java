package TheBasics.day6;

/**
 * 内部类实现学习：
 *
 */
public class Outer {
    private int num = 10;
/*    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }*/
    private class Inner{
        public void show(){
            System.out.println(num);
        }
}
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
