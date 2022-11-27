package TheBasics.day6;

/**
 *  *  3.局部内部类的特殊情况（匿名内部类）：存在一个类或者接口，这个类可以是聚体类也可以是抽象类。
 *  *      本质：是一个继承了该类或者实现了该接口的子类匿名对象。、
 *  *  4.
 *  *
 */
public class Outer02 {
    public void method(){
        //写匿名内部类的格式
        Inter04 i = new Inter04(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();
        i.show();
    }
}
