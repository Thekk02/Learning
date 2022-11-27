package DataStructure.algorithm.test;

import DataStructure.algorithm.sort.Selection;

import java.util.Arrays;

/*
 *对数组中的元素进行排序，选择排序(Selection)（Selection）
 * @author kkk
 * 成员方法（api）设计：
 * public static void sort(Comparable[] a):对数组中的元素进行排序
 * public static boolean greater（Comparable[] v,Comparable[] w）：判断v是否大于w
 * public static void exch(Comparable[] v,int i,int j):交换数组a中，索引i和j的值。
 **/
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));//{124578910}
    }
}
