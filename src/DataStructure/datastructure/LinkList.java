package DataStructure.datastructure;

import java.util.Iterator;

//单向链表实现
public class LinkList<T> implements Iterable{
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;



    //结点类
    private class Node {
        //存储元素
         T item;
        //指向下一个节点
        Node next;

        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }
    public LinkList(){
        //初始化头结点
        this.head = new Node(null,null);
        //初始化元素个数
        this.N = 0;
    }
    //清空链表
    public void clear(){
        head.next = null;
        this.N= 0;
    }
    //获取链表的长度
    public int length(){
        return N;
    }
    //判断列表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取指定位置i处的元素
    public T get(int i){
        //通过循环,从头结点喀什往后找,依次找i此就可以找到对应的元素.
        Node n = head.next;
        for (int index=0;index<i;index++){
            n = n.next;
        }
        return n.item;
    }
    //向链表中插入元素
    public void insert(T t){
        //找到当前最后一个节点
        Node n =head;
        while(n.next!=null){
            n = n.next;
        }
        //创建新节点,保存元素t
        Node newNode = new Node(t,null);
        //让当前最后一个节点指向新节点
        n.next = newNode;
        //元素的个数+1
        N++;
    }
    //向指定位置i处,添加元素t
    public void insert(int i,T t){
        //找到i前的一个节点
        Node pre = head;
        for(int index=0;index<=i-1;index++){
            pre = pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点,并且新节点需要指向原来i位置的结点
        Node newNode = new Node(t,curr);
        //原来i位置的前一个节点指向新节点即可
        pre.next = newNode;
        //元素的个数+1
        N++;
    }
    //删除指定i位置的结点,并返回被删除的元素
    public T remove(int i){
        //找到i位置的前一个节点
        Node pre = head;
        for(int index=0;index<=i-1;i++){
            pre = pre.next;
        }
        //找到i位置的节点
        Node curr = pre.next;
        //找到i位置的下一个结点
        Node nextNode = curr.next;
        //前一个结点指向下一个节点
        pre.next = nextNode;
        //元素个数-1
        N--;
        return curr.item;
    }
    //查找出元素t在链表中第一次出现的位置1
    public int indexof(T t){
        //从头结点开始,依次找到每一个结点,取出item,和t比较,如果相同,就找到了
        Node n = head;
        for(int i=0;n.next!=null;i++){
            n = n.next;
            if(n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }
    //实现遍历方式

    @Override
    public Iterator iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator{
        private Node n;
        public  LIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }

    //反转整个链表
    public void reverse(){
        //判断当前链表是否为空链表，如果是空ing链表，则结束运行，如果不是，则调用重载的reverse方法
        if(isEmpty()){
            return;
        }
        reverse(head.next);
    }
    //反转指定的结点curr，并把反转后的结点放回
    public Node reverse(Node curr){
        if(curr.next==null){
            head.next = curr;
            return curr;
        }
        //递归的反转当前结点curr的下一个结点，返回值就是链表反转后，当前接待你的上一个结点
        Node pre = reverse(curr.next);
        //让返回的节点的下一个结点变为当前接待你curr；
        pre.next = curr;
        //把当前节点的下一个结点变为null
        curr.next = null;
        return curr;
    }







}
