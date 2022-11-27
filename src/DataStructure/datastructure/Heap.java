package DataStructure.datastructure;

public class Heap<T extends Comparable<T>>{
    //用来存储元素的数组
    private T[] items;
    //记录堆中元素的个数
    private int N;
    //创建容量为capacity的Heap对象
    public Heap(int capacity){
        this.items = (T[])new Comparable[capacity+1];
        this.N = 0;
    }
    //判断堆中索引处的元素是否小于索引j处的元素
    private boolean less(int i,int j){
        return items[i].compareTo(items[j])<0;
    }
    //交换堆中索引i和索引j处的值
    private void exch(int i,int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
        //这里提供两个变量交换值的另外两种方法


    }
    //删除堆中最大的元素，并返回这个最大元素
    public T delMax(){
        T max = items[1];
        //交换索引1处的元素和最大索引处的元素，让完全二叉树中最右侧的元素变为临时根结点
        exch(1,N);
        //最大索引处的元素删除掉
        items[N] = null;
        //元素个数-1
        N--;
        //通过下沉算法调整堆,让堆重新排序
        sink(1);
        return max;
    }
    //往堆中插入一个元素
    public void insert(T t){
        items[++N] = t;
        swim(N);
    }
    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k){
        //通过循环不断比较当前结点的值和父节点的值，
        // 如果发现父节点的值比当前结点的值小，则交换位置
        while(k>1){
            //比较当前结点和其父节点
            if(less(k/2,k)){
                exch(k/2,k);
            }
            k = k/2;
        }
    }
    //使用下沉算法，使堆中的元素能在堆中处于一个正确的位置
    private void sink(int k){
        //通过循环不断对比当前结点和其左子结点2k以及右子结点2k+1处的元素大小，
        // 如果当前结点小，则需要交换位置
        while(2*k<=N){
            //获取当前节点的子结点中的较大结点
            int max;//记录较大结点所在的索引
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max = 2*k;
                }
            }else{
                max = 2*k;
            }
            //比较当前结点和较大结点的值
            if(!less(k,max)){
                break;
            }
            //交换k索引处的值和max索引处的值
            exch(k,max);
            k = max;
        }
    }
}










