package TheBasics.day7;

/**
 * System类的使用
 */
public class Learning702 {
    public static void main(String[] args) {
        System.out.println("xuexi");
        //System.exit(0);
        // public static long currentTimeMillis():返回当前时间（毫秒为单位）
        System.out.println(System.currentTimeMillis()*1.0 / 1000 / 60 / 24 / 365);
        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
