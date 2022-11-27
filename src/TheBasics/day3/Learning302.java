package TheBasics.day3;

import java.util.Random;
import java.util.Scanner;

/**
 * 程序生成一个1-100之间的数字，猜中退出
 */
public class Learning302 {
    public static void main(String[] args) {
        //随机生成要猜的数字
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while(true){
            //使用键盘录入实现猜数字操作
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessnumber = sc.nextInt();
            //比较生成的数据和猜的数据
            if(number > guessnumber){
            System.out.println("你猜的数字" + guessnumber+ " 小了" );
            } else if (number < guessnumber) {
            System.out.println("你猜的数字" + guessnumber+ " 大了" );
            }else {
            System.out.println("恭喜你猜中了");
            break;
            }
        }
    }
}
