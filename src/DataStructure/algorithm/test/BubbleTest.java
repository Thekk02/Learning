package DataStructure.algorithm.test;

import DataStructure.algorithm.sort.Bubble;

import java.util.Arrays;

/*需求：
排序前{4，5，6，3，2，1}
排序后{1，2，3，4，5，6}
排序原理：
1.比较相邻的元素，如果前一个元素比后一个元素大，就交换这两个元素的位置。
2.对每一对相邻的元素做同样的工作，从开始的第一队元素到最后一对元素。最终最后位置就是最大值。*/
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,1,2,3};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));//{1,2,3,4,5,6}
    }
}
