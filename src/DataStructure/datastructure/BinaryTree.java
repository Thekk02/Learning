package DataStructure.datastructure;

public class BinaryTree<Key extends Comparable<Key>,Value> {
    //记录根结点
    private Node root;
    //记录元素个数
    private int N;
    private class Node{
        //存储键
        public Key key;
        //存储值
        public Value value;
        //记录左子结点
        public Node left;
        //记录右子结点
        public Node right;
        public Node(Key key,Value value,Node left,Node right){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    //获取树中的元素个数
    public int size(){
        return N;
    }
    //向树中添加元素key-value
    public void put(Key key,Value value){
        root = put(root,key,value);

    }
    //向指定的x中添加key-value，并返回添加元素后的树
    private Node put(Node x,Key key,Value value){
        //如果子树为空
        if(x==null){
            N++;
            return new Node(key,value,null,null);
        }
        //如果x子树不为空
        //比较x结点的键和key的大小：
        //如果key大于x结点的值，则继续找x结点的右子树
        int cmp = key.compareTo(x.key);
        if(cmp>0){
            x.right = put(x.right,key,value);
            //如果key小于x结点的值，则继续找x结点的左子树
        }else if(cmp<0){
            x.left = put(x.left,key,value);
        }else{
            x.value = value;
        }//如果key等于x结点的值，替换x结点的value
        return x;
    }
    //查询树中指定key对应的值
    public Value get(Key key){
        return get(root,key);
    }
    //从指定的树x中，查询key对应的值
    public Value get(Node x,Key key){
        //x树为null
        if(x==null){
            return null;
        }
        //x不为null
        //比较key与x的值
        //如果key大于x结点的值，则继续找x结点的右子树
        int cmp = key.compareTo(x.key);
        if(cmp>0){
            return get(x.right,key);
            //如果key小于x结点的值，则继续找x结点的左子树
        }else if(cmp<0){
            return get(x.left,key);
        }else{
            return x.value;
        }//如果key等于x结点的值，就找到了键为key的结点的值

    }
    //删除树种key对应的value
    public void delete(Key key){
        delete(root,key);
    }
    //删除树x中key对应的value
    public Node delete(Node x,Key key){
        //x树为null
        if(x==null){
            return null;
        }
        //x不为null
        //比较key与x的值
        int cmp = key.compareTo(x.key);
        //如果key大于x结点的值，则继续找x结点的右子树
        if(cmp>0){
            x.right = delete(x.right,key);
            //如果key小于x结点的值，则继续找x结点的左子树
        }else if(cmp<0){
            x.left = delete(x.left,key);
        }else{//如果key等于x结点的值，就找到了键为key的结点的值
            //找到右子树中最小的结点
            N--;
            if(x.right==null){
                return x.left;
            }
            if(x.left==null){
                return x.right;
            }
            Node minNode = x.right;
            while(minNode.left!= null){
                minNode = minNode.left;
            }
            //删除树中最小的结点
            Node n =x.right;
            while(n.left!=null){
                if(n.left.left==null){
                    n.left = n.right;
                }else{//变换n结点就可以
                    n = n.left;
                }
            }
            //让x结点的左子树成为minNode的左子树
            minNode.left = x.left;
            //让x结点的右子树成为minNode的右子树
            if(minNode==x.right){
                minNode.right = x.right.right;
            }else{
                minNode.right = x.right;
            }
            //假如删除的是根节点，这个方法首先会传入root节点，然后令x=root，所以对x进行的操作只能是对指向root的对象属性的操作。
            //如果只是单纯的x=minNode,这只能修改根节点之外的其他的节点，因为x只是一个引用，让x=minNode,这只是修改了赋给x的地址
            //而没有修改指向root的地址，因为遍历是从root节点开始的，所以这会导致遍历出现问题
            //让x结点的父结点指向minNode
            if(x==root){
                root = minNode;
            }else{
                x = minNode;
            }
        }
        return x;
    }
    //查找整个树中最小键的值
    public Key min(){
        return min(root).key;
    }
    //查找指定树中的最小键的值
    public Node min(Node x){
        //判断x有没有左子节点，如果有，则继续向左找，如果没有，
        // 则x就是最小键所在的结点
        if(x.left!=null){
            return min(x.left);
        }else{
            return  x;
        }
    }
    //查找整个树中最大键的值
    public Key max(){
        return max(root).key;
    }
    //查找指定树中最大键的值
    public Node max(Node x){
        //判断x还有没有右子结点
        if(x.right!=null) {
            return max(x.right);
        }else{
            return x;
        }
    }
    //前序遍历获取整个树中所有的键
    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root,keys);
        return keys;
    }
    //前序遍历获取指定树中所有的键
    private void preErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        //首先把x结点的key放入keys中
        keys.enqueue(x.key);
        //递归遍历x结点的左子树
        if(x.left!=null){
            preErgodic(x.left,keys);
        }
        //递归遍历x结点的右子树
        if(x.right!=null){
            preErgodic(x.right,keys);
        }
    }
    //中序遍历
    //使用中序遍历获得树中所有的键
    public Queue<Key> midErgodic(){
         Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }
    //使用中序遍历获得指定树中所有的键
    private void midErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        //递归先把左子树中所有的键放到keys中
        if(x.left!=null){
            midErgodic(x.left,keys);
        }
        //把当前结点的键放到keys中
        keys.enqueue(x.key);
        //递归把右子树中所有的键放到树中。
        if(x.right!=null){
            midErgodic(x.right,keys);
        }
    }
    //后序遍历
    //使用后序遍历获取树中所有的键】
    public Queue<Key> afterErgodic(){
        Queue<Key> keys = new Queue<>();
        afterErgodic(root,keys);
        return keys;
    }
    //使用后序遍历获取指定树中所有的键
    private void afterErgodic(Node x,Queue<Key> keys){
        if(x==null){
            return;
        }
        //递归先把左子树中所有的键放到keys中
        if(x.left!=null){
            afterErgodic(x.left,keys);
        }
        //递归把右子树中所有的键放到树中。
        if(x.right!=null){
            afterErgodic(x.right,keys);
        }
        //把当前结点的键放到keys中
        keys.enqueue(x.key);
    }
    //使用层序遍历方法遍历二叉树
    //实现步骤：
    //1.创建队列，存储每一层的结点
    //2.使用循环从队列中弹出一个结点：
    //  2.1获取当前结点的key
    //  2.2如果房前结点的左子节点不为空，贼把做左子节点放入到队列中
    //  2.3如果当前结点的右子节点不为空，则把右子节点放入到队列中.
    public Queue<Key> layerErgodic(){
        //定义两个队列，分别存储书中的键和树中的结点
        Queue<Key> keys = new Queue<Key>();
        Queue<Node> nodes = new Queue<Node>();
        //默认在队列中放入根结点
        nodes.enqueue(root);
        while(!nodes.isEmpty()){
            //从队列中弹出一个节点，把key放入到keys中
            Node n = nodes.dequeue();
            keys.enqueue(n.key);
            //判断当前节点还有没有左子节点，如果有，放入到nodes中
            if(n.left!=null){
                nodes.enqueue(n.left);
            }
            //判断当前结点还有没有右子节点，如果有，则放入到nodes中
            if(n.right!=null){
                nodes.enqueue(n.right);
            }
        }
        return keys;
    }
    //获取整个树的最大深度
    public int maxDepth(){
        return maxDepth(root);
    }
    //获取指定树的最大深度
    private int maxDepth(Node x){
        if(x==null){
            return 0;
        }
        //x的最大深度
        int max = 0;
        //左子树的最大深度
        int maxL = 0;
        //右子树的最大深度
        int maxR = 0;
        //计算x结点左子树的最大深度
        if(x.left!=null){
            maxL = maxDepth(x.left);
        }
        //计算x结点右子树最大深度，取较大值+1即可
        if(x.right!=null){
            maxR = maxDepth(x.right);
        }
        //比较左右手子树最大深度，取较大值+1就可以了。
        max = maxL > maxR ? maxL+1 : maxR+1;
        return max;
    }
}











