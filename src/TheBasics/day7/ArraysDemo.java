package TheBasics.day7;

import java.util.Arrays;

/**
 * Arrays：包含用于操作数组的各种方法
 * public static String toString(int[] a)返回指定数组的内容的字符串表示形式
 * public static void sort(int[] a)按照数字顺序排列1指定的数组
 *
 */
public class ArraysDemo {
    public static void main(String[] args) {
    //定义一个数组
        int[] arr = {21,345,45,7654,34};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
