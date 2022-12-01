package TheBasics.day7;

import java.util.Scanner;

/**
 * 异常的学习
 * throws:用在方法申明的后面，跟的是异常类名
 *  表示抛出异常，由该方法的调用者来处理
 *  表示出现异常的一种可能性，并不一定会发生这些异常
 * throw：用在反复噶体内，跟的是异常对象名
 *  表示抛出异常，由方法体内的语句处理
 *  执行throw一定抛出了某种异常
 *
 */
public class Learning707 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("输入分数：");
        int score  = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
