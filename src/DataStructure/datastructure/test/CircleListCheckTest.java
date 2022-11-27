package DataStructure.datastructure.test;

public class CircleListCheckTest {
    public static void main(String[] args) {
        //创建结点
        Node<String> first = new Node<String>("aa",null);
        Node<String> second = new Node<String>("bb",null);
        Node<String> third = new Node<String>("cc",null);
        Node<String> fourth = new Node<String>("dd",null);
        Node<String> fifth = new Node<String>("ee",null);
        Node<String> six = new Node<String>("ff",null);
        Node<String> seven = new Node<String>("gg",null);
        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //产生环
        seven.next = third;
        //判断链表是否有环
        boolean circle = isCircle(first);
        System.out.println("first链表中是否有环："+circle);

    }
    /**判断链表是否有环
     * @param first 链表首结点
     * @return ture为有环 fasle为无2环
    ** */

    private static boolean isCircle(Node<String> first) {
        //定义两个快慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        //遍历链表，如果快慢指针指向了同一结点，证明有环。
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }

    /**
     * @param first 链表的首结点
     * @return 链表的中间结点的值
     */
    public static String getMid(Node<String> first){
        //定义两个指针（其实就是节点）
        Node<String> fast = first;
        Node<String> slow = first;
        //使用两个指针遍历链表，
        // 当快指针指向的结点没有下一个节点的时候就结束了，
        // 结束了之后幔指针指向的结点就是中间值
        while(fast!=null && fast.next!=null){
            //变化指针
            fast = fast.next.next;
            slow = slow.next;
        }
        //
        return slow.item;
    }
    private static class Node<T>{
        //存储数据
        T item ;
        //下一个节点
        Node next;
        public Node(T item, Node Next){
            this.item = item;
            this.next = next;
        }
    }
}
