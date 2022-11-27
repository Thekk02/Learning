package DataStructure.datastructure;

public class HeapSort {
    //对source数组中的数据从小到大排序
    public static void sort(Comparable[] source){
        //构建堆
        Comparable[] heap = new Comparable[source.length+1];
        createHeap(source,heap);
        //定义一个变量，记录未排序的元素中最大的索引
        int N = heap.length-1;
        //通过循环，交换i索引处的元素和排序的元素中最大的索引处的元素
        while(N!=1){
            //交换元素
            exch(heap,1,N);
            //排序交换后最大元素所在的索引，让他不要参与堆的下沉调整、
            N--;
            //需要堆索引1出的元素进行下沉调整
            sink(heap,1,N);
        }
        //把heap中的数据复制到原数组source
        System.arraycopy(heap,1,source,0,source.length);
    }
    //根据原数组source构造堆heap
    private static void createHeap(Comparable[] source,Comparable[] heap){
        //可以通过一个小技巧创建新数组copy原数组的元素（注意索引0处应为null），
        //再从新数组长度的一半（堆的特性，前一半是=非叶子结点，后一半是叶子结点）
        // 处开始往1索引处扫描（从右往左），然后对扫描道的每一个元素做下沉调整即可

        //把source中的元素拷贝到heap中，heap中的元素就形成了一个堆，
        // 但是heap中的元素是无序的
        System.arraycopy(source,0,heap,1,source.length);
        for(int i = (heap.length)/2;i>0;i--){
            sink(heap,i,heap.length-1);
        }

    }
    //判断heap堆中索引i处的元素是否小于索引j处的值
    private static boolean less(Comparable[] heap,int i,int j){
        return heap[i].compareTo(heap[j])<0;
    }
    //交换heap堆中i索引处的值和j索引处的值
    private static void exch(Comparable[] heap,int i,int j){
        Comparable tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    //在heap堆中，堆target处的元素做下沉，范围是0-range
    private static void sink(Comparable[] heap,int target,int range){
        while(2*target<=range){
            //1.找出当前结点的较大的子结点
            int max ;
            if(2*target+1<=range){
                if(less(heap,2*target,2*target+1)){
                    max = 2*target+1;
                }else{
                    max = 2*target;
                }
            }else{
                max = 2*target;
            }
            //2.比较当前节点的值和较大子结点的值
            if(!less(heap,target,max)){
                break;
            }
            exch(heap,target,max);
            target = max;
        }

    }
}



















