package TheBasics.day8;
/**
 * Collection的遍历
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("Java");
        Iterator<String> it = c.iterator();//返回的是Itr的对象
        /*

         */
/*        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        //报错：Exception in thread "main" java.util.NoSuchElementException
        //	at java.util.ArrayList$Itr.next(ArrayList.java:864)
        //	at TheBasics.day8.IteratorDemo.main(IteratorDemo.java:22)
/*        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }*/

        //用循环改进判断
        while(it.hasNext()){
            //System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
