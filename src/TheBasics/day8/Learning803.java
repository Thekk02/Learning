package TheBasics.day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set：接口，继承自Collection，全部与Collection功能相同，没有索引
 *  不包含重复元素
 *  HashSet对集合的迭代顺序不做保证
 *  哈希值：
 *      jdk根据对象的2地址或者字符串或者数字算出来的int类型的数值
 *      获取哈希值方法：hashCode（）
 *
 *      HashSet：底层数据结构是哈希表
 *              对集合的迭代顺序不做任何保证，也就是说不保证存储和取出的元素顺序一致。
 *              没有索引，不能for循环
 *              HashSet保证元素唯一性的方法：
 *              使用add方法：
 *              public boolean add(E e) {
 *         return map.put(e, PRESENT)==null;
 *     }
 *              public V put(K key, V value) {
 *         return putVal(hash(key), key, value, false, true);
 *     }
 *     key与元素的hashCode相关
 *               static final int hash(Object key) {
 *         int h;
 *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 *     }
 *         public V put(K key, V value) {
 *         return putVal(hash(key), key, value, false, true);
 *     }
 *
 *
 *
 *     哈希表：默认初始容量为16
 *     jdk8之前底层采用链表+数组实现，可以说是一个元素为链表的数组
 *     jdk8以后，在长度比较长的时候，底层实现了优化。
 *     存储时会将对象的哈希值对16取模，得到的数是2就放在2的位置，以此类推
 *     如果哈希值相同就会比较内容，如果不同则会存储在相同位置的链表后面扩展
 *     如果内容也相同则不会存储
 *
 *
 *
 *     LinkedHashSet：由哈希表和链表实现的set接口，
 *     由链表保证元素有序，即存入和取出的顺序一致
 *     由哈希表保证元素唯一，
 *
 *      TreeSet：间接的实现类set接口
 *      元素有序：按照一定的规则：
 *          默认无参构造：元素的自然排序
 *          TreeSet（Comparator comparator）：根据指定的比较器进行排序
 *          没有带索引的方法，所以不能使用普通for循环遍历
 *          不包含重复元素
 *          带参构造：使用比较器排序对元素进行排序：
 *          比较器排序：就是让集合构造方法接受Comparator的实现类对象，重写compare（T o1，T o2）方法
 *          必须按照规则的主要和次要规则来写
 *
 */
public class Learning803 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add("world");//特点：不会重复存储

        //遍历
        for(String str:s){
            System.out.println(s.hashCode());
            System.out.println(s.hashCode());
            //同一个对象多次调用hashCode方法返回的哈希值是相同的
            //不同的对象的哈希值，默认是相同的
            //通过方法重写可以实现不同对象的哈希值相同。
            System.out.println(str);
        }
        //字符串重写了hashCode方法。
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("world");
        hs.add("hello");
        hs.add("java");
        for(String str:hs){
            System.out.println(str);
        }




        //LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("java");//不会存储保证唯一
        for(String str:lhs){
            System.out.println(str);
        }


        //TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();//默认自然排序

        //添加
        ts.add(2);
        ts.add(43);
        ts.add(5);
        ts.add(46);
        for(Integer i:ts){
            System.out.println(i);
        }
        //Comparable学习：














    }
}
