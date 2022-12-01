package TheBasics.day9;

/**
 * 递归学习：
 * 即定义方法的时候调用本身的现象
 * 递归非常占用内存：要慎重写。
 *
 */
public class learning902 {
    public static void main(String[] args) {
        //不死神兔问题，二十个月的时候有多少兔子
        System.out.println(sum(20));
        System.out.println(Factorial(5));
    }
    public static int sum(int n){
        if(n == 1||n == 2){
            return 1;
        }
        return sum(n-1) + sum(n-2);
    }
    //利用递归求阶乘
    public static int Factorial(int n){
        if(n == 1){return 1;}
        return n * Factorial(n - 1);
    }
}
