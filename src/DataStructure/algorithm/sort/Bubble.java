package DataStructure.algorithm.sort;
/*
*对数组中的元素进行排序，冒泡排序（Bubble）
* @author kkk
* 成员方法（api）设计：
* public static void sort(Comparable[] a):对数组中的元素进行排序
* public static boolean greater（Comparable[] v,Comparable[] w）：判断v是否大于w
* public static void exch(Comparable[] v,int i,int j):交换数组a中，索引i和j的值。
**/
public class Bubble {
    public static void sort(Comparable[] a){
        for (int i = a.length-1;i > 0;i--){
            for(int j = 0;j<i;j++){
                //比较索引j和j+1处的值
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
