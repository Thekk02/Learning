package TheBasics.day8;

import java.beans.beancontext.BeanContextSupport;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection
 * 集合类：Collection(单列)-->List（可重复）-->ArrayList，Set(不可重复);Map(双列).
 * Iterator:迭代器，集合的专用遍历方式（next,hashnext()）
 * 集合使用：创建集合，添加元素，遍历集合（获取迭代器对象，通过迭代器的hasNext判断，最后next）
 */
public class Learning801 {
    public static void main(String[] args) {
        //Collection集合的对象使用
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("Java");
        System.out.println(c);//[hello, world, Java]重写了toString方法
        //Collection方法
/*        c.remove();
        c.contains();
        c.clear();
        c.size();
        c.isEmpty();*/

    }
}
