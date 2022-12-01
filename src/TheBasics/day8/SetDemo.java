package TheBasics.day8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//不重复随机数产生
public class SetDemo {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>();

        //创建随机数对象
        Random r = new Random();

        //判断集合长度是不是小于10
        while(set.size()<10){
            //产生一个随机数，添加到集合
             int num = r.nextInt(20)+1;
             set.add(num);
        }
        //遍历集合
        for(Integer i:set){
            System.out.println(i);
        }
    }
}
