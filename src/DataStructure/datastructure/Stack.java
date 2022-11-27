package DataStructure.datastructure;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    //记录首结点
    private Node head;
    //栈中元素的个数
    private int N;



    private class Node<T> {
        //存储元素
        public T item;
        //指向下一个节点
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    public Stack(){
        this.head = new Node(null,null);
        this.N = 0;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取栈中元素个数
    public int size(){
        return N;
    }
    //把t元素压入栈
    public void push(T t){
        //找到首结点指向的的一个结点
        Node oldFirst = head.next;
        //创建新节点
        Node newNode = new Node<T>(t,null);
        //让首结点指向新节点
        head.next = newNode;
        //让新节点指向原来的第一个结点
        newNode.next = oldFirst;
        //元素个数+1
        N++;
    }
    //弹出栈顶元素
    public T pop(){
        //找到首结点指向的下一个结点
        Node<T> oldFirst = head.next;
        if(oldFirst ==null){
            return null;
        }
        //让首结点指向第一个节点的下一个结点
        head.next = oldFirst.next;
        //元素个数-1
        N--;
        return oldFirst.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private Node n;
        public SIterator(){
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }








}
