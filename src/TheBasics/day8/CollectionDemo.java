package TheBasics.day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("a",12);
        Student s2 = new Student("b",13);
        Student s3 = new Student("c",15);

        //添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //遍历集合
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            String  s = it.next().toString();
            System.out.println(s);
        }
    }
}
