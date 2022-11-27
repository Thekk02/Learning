package DataStructure.algorithm.sort;
/*
 *对数组中的元素进行排序，选择排序(Selection)（Selection）
 * @author kkk
 * 成员方法（api）设计：
 * public static void sort(Comparable[] a):对数组中的元素进行排序
 * public static boolean greater（Comparable[] v,Comparable[] w）：判断v是否大于w
 * public static void exch(Comparable[] v,int i,int j):交换数组a中，索引i和j的值。
 **/
public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0;i <= a.length - 2;i++){
            //定义一个变量，记录最小元素所在的索引，默认为选择参与选择排序的第一个元素
            int minIndex = i;
            for (int j =i+1;j<a.length;j++){
                //需要比较最小索引处minIndex处的值与索引j处的值；
                if (greater(a[minIndex],a[j])){
                    minIndex = j;
                }
            }
            //交换最小元素所在索引imnIndex处的值和索引i处的值
            exch(a,i,minIndex);
        }
    }
    public static boolean greater(Comparable v,Comparable w){
        /*比较v元素是否大于w元素
        * */
        return v.compareTo(w)>0;
    }
    public static void exch(Comparable[] a,int i,int j){
        /*
        * 数组元素i和j交换位置*/
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
