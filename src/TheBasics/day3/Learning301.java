package TheBasics.day3;

import java.util.Random;

/**
 * 1.random的使用
 * 导包
 * 创建对象
 * 获取随机数
 * */
public class Learning301 {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        int number = r.nextInt(100);
        System.out.println(number);
    }
}
