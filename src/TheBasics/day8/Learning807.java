package TheBasics.day8;

import java.util.ArrayList;
import java.util.List;

/**
 * 增强for循环:底层是一个Iterator迭代器：所以用常规的add方法会导致并发修改异常
 * jdk5后出现
 */
public class Learning807 {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,342};
        for(int i:arr){
            System.out.println(i);
        }
        String[] strarr = {"weew","sd","sdas"};
        for(String s:strarr){
            System.out.println(s);
        }
        List<String> l = new ArrayList<String>();
        l.add("sds");
        l.add("sdsd");
        l.add("sdasdd");
        for(String s:l){
            System.out.println(s);
        }
    }
}












