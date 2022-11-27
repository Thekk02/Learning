package DataStructure.datastructure.test;

import DataStructure.datastructure.MaxPriorityQueue;

public class MaxPriotityQueueTest {
    public static void main(String[] args) {
        //创建最大优先队列
        MaxPriorityQueue<String> Queue = new MaxPriorityQueue<String>(10);

        //往队列中存储元素
        Queue.insert("A");
        Queue.insert("B");
        Queue.insert("C");
        Queue.insert("D");
        Queue.insert("E");
        Queue.insert("F");
        Queue.insert("G");
        //通过循环从队列中获取最大元素
        while(!Queue.isEmpty()){
            String max = Queue.delMax();
            System.out.println(max);
        }
    }
}
