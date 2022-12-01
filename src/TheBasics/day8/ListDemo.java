package TheBasics.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//侧式List
public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        //学生
        Student s1 = new Student("a",12);
        Student s2 = new Student("b",13);
        Student s3 = new Student("c",14);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        //迭代器方式遍历
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            String s = it.next().toString();
            System.out.println(s);
        }
        //for遍历
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //新需求：遍历每一个元素，如果有world的话，添加一个Java元素
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("world");
        l.add("javajava");
        //遍历集合
/*        Iterator<String> ite = l.iterator();
        while(ite.hasNext()){
            String s = ite.next();
            if(s.equals("world")){
                l.add("java");
            }
        }
        System.out.println(l);//抛错：Exception in thread "main" java.util.ConcurrentModificationException
        //at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
        //at java.util.ArrayList$Itr.next(ArrayList.java:861)
        //at TheBasics.day8.ListDemo.main(ListDemo.java:39)*/
        //

        //使用for遍历
        for(int i = 0;i<l.size();i++){
            String s = l.get(i);
            if(s.equals("world")){
                l.add("java");
            }
        }
        System.out.println(l);
    }
}























