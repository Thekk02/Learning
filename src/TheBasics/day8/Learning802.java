package TheBasics.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List:接口，继承自Collection，有序集合，也称为序列，
 * 可以通过整数索引查询，有序且允许重复
 *
 * 并发修改异常：List内部实现的时候：modCount：实际修改集合的次数，
 *                           expectedModcount：预期修改集合的次数
 *                           当两个值不一样的时候爆出并发异常
 *                           在执行add方法的时候modCount会自增导致出错。
 * 但是在执行get的时候modCount不会改变，所以通过for循环不会发生并发修改异常。
 * List的子类：
 * 1,ArrayList：数组：查询快，增删慢。（常用）
 * 2.LinkedList：链表：增删快，查询慢。
 * LinkedList特有的功能：链表的特有功能
 */
public class Learning802 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        //迭代器的方式遍历
        Iterator it = list.iterator();
        System.out.println(it.next());
        //这里只演示特定方法
        System.out.println(list);
        list.add(1,"javajava");
        System.out.println(list);
        list.remove(1);
        //list.remove(11);//索引越界Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 11, Size: 3
        //at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        //at java.util.ArrayList.remove(ArrayList.java:498)
        //at TheBasics.day8.Learning802.main(Learning802.java:30)
        list.set(1,"javajavajava");
        System.out.println(list);
        list.get(1);
        //可以通过索引遍历
        int length = list.size();
        System.out.println(length);

        //特有的列表迭代器ListIterator继承自Iterator
        ListIterator<String> lit = list.listIterator();
        //特有方法
        lit.hasPrevious();//返回列表的上一个元素，倒序遍历。仅供参考

        //重点实现:解决并发修改异常的问题：expectedModCount = ModCount
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("java");
            }
        }
        System.out.println(list);
    }
}













