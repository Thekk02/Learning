package TheBasics.day3;

/**
 * 数组模块学习：存储多个相同数据类型数据的存储格式
 * 1.定义格式
 * 2.数组初始化之动态初始化(只指定数组长度，由系统为数组分配初始值)
 * 3.数组元素访问
 * 4.内存分派
 * 5.数组初始化之静态初始化
 * 6.数组操作的两个常见小问题
 * 7。数组常见操作
 */
public class Learning303 {
    public static void main(String[] args) {
        //数组定义格式
        int[] arr = new int[3];
        //数组元素访问
        System.out.println(arr);//输出数组名
        System.out.println(arr[0]);//输出数组值
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //内存分配（数组初始化时会为存储空间添加默认值）
        //整数：0，浮点数：0.0，布尔值：false字符：默认是空字符，引用数据类型：null
        //栈内存：存储局部变量，使用完毕，立即消失
        //堆内存：存储new出来的内容（实体，对象），每一个new出来的东西都会有一个地址值，使用完毕，会在垃圾回收期空闲时被回收
        //静态初始化
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);//输出数组名
        System.out.println(arr1[0]);//输出数组值
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        //数组操作的两个小问题：
        //1.索引越界：访问了数组中不存在的索引对应的元素
        //2.空指针异常：访问的数组已经不再指向堆内存的数据

        //数组遍历
        int[] arr2 = new int[]{11,22,33,44,55};
        int len = arr2.length;
        for(int i = 0; i<len;i++){
            System.out.println(arr2[i]);
        }
        //获取最值
        int[] arr3 = new int[]{12,34,4565,6767,34,25,45,};
        int len1 = arr3.length;
        int max = arr3[0];
        for(int i = 1;i < len1;i++){
            if(max < arr3[i]){
                max = arr3[i];
            }
        }
        System.out.println(max);
    }



}
