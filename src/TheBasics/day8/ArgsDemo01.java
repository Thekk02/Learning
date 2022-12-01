package TheBasics.day8;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(12,34));
        System.out.println(sum(12,34,23));
        System.out.println(sum(12,34,234));
        System.out.println(sum(12,34,3445));


    }
    public static int sum(int...a) {//a其实是一个数组,所以可以用该数组的求和方式
        //如果需要多个参数，不变的参数应该放在前面，如：public static int sum(int b,int...a)
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }

}
