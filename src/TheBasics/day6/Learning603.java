package TheBasics.day6;

/**
 * 接口的学习：
 * 1.接口就是一种公共的规范标准，只要符合规范标准，大家都可以使用
 * 2.类实现用implements表示
 * 3.接口不能实例化：可以参照多态的方式，通过实现类对象实现实例化，
 * 4。接口中的成员变量只能是常量，而且默认被static final修饰。
 * 5.接口里面是没有具体的构造方法。
 * 6.接口里面不能有非抽象方法。（默认修饰public abstract）
 * 7.类和接口的关系：实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
 * 8.接口和接口的关系：可以单继承，也可以多继承。
 * 9，抽象类和接口的区别：
 *  1.抽象类可以有变量常量，构造反复噶，有抽象方法，也有非抽象方法
 *  2.接口只能由常量和抽象方法
 *  3.
 */
public class Learning603 {
    public static void main(String[] args) {
        Jumping j = new Sheep();
        j.jump();
    }
}
