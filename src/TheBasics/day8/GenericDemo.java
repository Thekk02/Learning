package TheBasics.day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
        //Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();//泛型为String
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(100);

        //遍历集合
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);
            //String s = (String)it.next();//不用泛型情况下：当有Integer时会报错：Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            //at TheBasics.day8.GenericDemo.main(GenericDemo.java:23)

            String s = it.next();
            System.out.println(s);
        }
    }
}



















