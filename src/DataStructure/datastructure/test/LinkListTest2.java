package DataStructure.datastructure.test;

import DataStructure.datastructure.LinkList;

public class LinkListTest2 {
    public static void main(String[] args) {
        //创建单向链表对象
        LinkList<String> s1 = new LinkList<>();
        //测试插入
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");
        for (Object o : s1) {
            System.out.println(o);
        }
        System.out.println("--------------------------------");
        s1.reverse();
        for (Object o : s1) {
            System.out.println(o);
        }
    }
}
