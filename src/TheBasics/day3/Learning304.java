package TheBasics.day3;

/**
 * 方法概述：
 * 1.将独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
 * 2.方法的定义与调用
 * 3.带参数方法得定义与调用
 * 4.带返回值方法的定义与调用
 * 5.方法注意事项
 * 6.方法重载
 * 7.方法的参数传递
 */
public class Learning304 {
    public static void main(String[] args) {
        int result1 = sum(1,3,5);
        int result2 = sum(1,3);
        double result3 = sum(1.0,30.0);
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
    }
        //方法重载：
        //指同一个类中定义的多个方法支架的呢关系，满足以下条件的多个方法相互构成重载
        //多个方法在同一个类中
        //多个方法具有相同的方法名
        //多个方法的参数不相同，类型不同或者数量不同
        //与返回值无关
        //在调用的时候jvm会根据参数的不同来区分同名的方法


        //需求1：两个int求和
        public static int sum(int a,int b){return a+b;}
        //需求2：两个double求和
        public static double sum(double a,double b){return a+b;}
        //需求3：三个int求和
        public static int sum(int a,int b,int c){return a+b+c;}
    }

