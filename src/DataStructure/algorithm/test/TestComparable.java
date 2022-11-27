package DataStructure.algorithm.test;

import DataStructure.algorithm.sort.Student;
/*
2.定义测试类test，在测试类中定义测试方法Comparable getMAX（comparable c1，Comparable c2）完成测试
@author kkk
 */
public class TestComparable {
    public static void main(String[] args) {
        //创建两个student对象，并调用getMax方法，完成测试。
        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(18);
        Student s2 = new Student();
        s1.setUsername("李四");
        s1.setAge(20);
        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }
    public static Comparable getMax(Comparable c1, Comparable c2){
        int result = c1.compareTo(c2);
        //如果result < 0,则c1比c2小；
        //反之则c1比c2大。
        //如果result == 0，则c1,c2一样大
        if(result > 0){
            return c1;
        }else{
            return c2;
        }
    }
}
