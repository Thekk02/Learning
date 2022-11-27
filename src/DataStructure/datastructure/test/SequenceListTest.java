package DataStructure.datastructure.test;

import DataStructure.datastructure.SequenceList;

import java.sql.SQLOutput;

public class SequenceListTest {
//    public static void main(String[] args) {
//        //创建一个顺序表对象
//        SequenceList<String> s1 = new SequenceList<>(10);
//
//        //测试插入
//        s1.insert("姚明");
//        s1.insert("科比");
//        s1.insert("麦迪");
//        s1.insert(1,"詹姆斯");
//        for (Object o : s1) {
//            System.out.println(o);
//        }
//        System.out.println("--------------------------------");
//
//
//
//        //测试获取
//        String getResult = s1.get(1);
//        System.out.println("获取索引1处的结果为："+getResult);
//        //测试删除
//        String removeResult = s1.remove(0);
//        System.out.println("删除的元素是："+removeResult);
//        //测试清空
//        s1.clear();
//        System.out.println("清空后的线性表中的元素个数为："+s1.length());
//    }
    //测试扩容
    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<>(3);
        s1.insert("张三");
        s1.insert("李四");
        s1.insert("王五");
        s1.insert("赵六");
        for (Object o : s1) {
            System.out.println(o);
        }
    }
}
