package DataStructure.datastructure.test;

public class JosephTest {

    public static void main(String[] args) {
        //解决约瑟夫问题

        //1.构建循环链表，包含41个结点，发别存储1-41之间的值
        //用来记录首届结点
        Node<Integer> first = null;
        //用来记录前一个结点
        Node<Integer> pre = null;

        for(int i=1;i<=41;i++){
            //如果是第一个结点
            if (i == 1) {
                first = new Node<>(i,null);
                pre = first;
                continue;
            }
            //如果不是第一个结点
             Node<Integer> newNode = new Node<Integer>(i,null);
            pre.next = newNode;
            pre = newNode;
            //如果是最后一个结点让他指向第一个结点就可以变成循环链表了。
            if(i==41){
                pre.next = first;
            }
        }
        //2，需要count计数器,还需要记录当前结点的上一个结点（才能完成删除操作）
        int count = 0;
        //3.遍历循环链表
        //记录每次遍历拿到的结点，默认从首结点开始
        Node<Integer> n = first;
        //记录当前结点的上一个结点
        Node<Integer> before = null;
        while(n.next!=n){
            //模拟报数
            count++;
            //判断当前报数是不是3
            //如果是3，则把当前结点删除调用，打印当前接待你，
            // 重置count=0，让当前接结点h后移
            if(count==3){
                before.next = n.next;
                System.out.println(n.item+ "");
                count = 0;
                n = n.next;
            }else{
               //如果不等于3，让before变为当前结点，让当前结点后移；
                before = n;
                n = n.next;
            }

        }
        //打印最后一个元素
        System.out.println(n.item);
    }
    //结点类
    private static class Node<T> {
        //存储元素
        public T item;
        //指向下一个节点
        public Node next;

        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }
}
