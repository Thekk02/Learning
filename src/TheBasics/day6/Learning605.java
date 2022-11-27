package TheBasics.day6;

/**
 *内部类学习：
 *1.内部类可以访问外部类的所有变量和放啊，反之，外部类也可以
 *2.内部类的分类：
 *  1.成员内部类（在类的成员位置）：
 *  2.局部内部类（在类的方法中定义）：
 *      局部内部类外界也是无法直接访问的，同样只能通过外部类对象访问。
 *  3.局部内部类的特殊情况（匿名内部类）：存在一个类或者接口，这个类可以是聚体类也可以是抽象类。
 *      本质：是一个继承了该类或者实现了该接口的子类匿名对象。、
 *  4.
 *
 */
public class Learning605 {
    public static void main(String[] args) {
        //外界创建成员内部类的方法,不常见，因为一般内部类的访问级别为private
        //Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.method();




        //匿名内部类测试
        Outer02 ou = new Outer02();
        ou.method();
    }
}
