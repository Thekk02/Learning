package DataStructure.datastructure.test;

import DataStructure.datastructure.Queue;

public class PaperFoldingTest {
    public static void main(String[] args) {
        //模拟折纸问题,产生时
        Node<String> tree = createTree(1);
        //遍历时，打印每个节点
        printTree(tree);
    }
    //通过模拟对折n次纸，产生树。
    public static Node createTree(int N){
        //定义根结点
        Node<String> root = null;
        for(int i = 0;i<N;i++){
            //如果是第一次对折
            if(i==0){
                root = new Node<>("down",null,null);
                continue;
            }
            //如果不是第一次对折
            //首选定义一个辅助队列，通过层序遍历的思想给叶子结点添加子结点
            Queue<Node> queue = new Queue<Node>();
            queue.enqueue(root);
            //循环遍历队列
            while(!queue.isEmpty()){
                //从队列中弹出一个结点
                Node<String> n = queue.dequeue();
                //如果有左子节点，则把左子节点放入到队列中
                if(n.left!=null){
                    queue.enqueue(n.left);
                }
                //如果有右子节点，则把右子节点放入到队列中
                if(n.right!=null){
                    queue.enqueue(n.right);
                }
                //如果同时没有左子节点和右子节点，那么证明该结点是叶子节点，
                // 只需要给该节点田间左子节点和右子节点就可以了
                if(n.left==null && n.right==null) {
                    n.left = new Node<String>("down", null, null);
                    n.right = new Node<String>("up", null, null);
                }
            }
        }
        return root;
    }
    //打印树中每个节点
    public static void printTree(Node<String> root){
        //需要使用中序遍历完成
        if(root==null){
            return ;
        }
        // 打印左子树的每个结点
        if(root.left!=null){
            printTree(root.left);
        }
        //打印当前结点
        System.out.print(root.item+" ");
        // 打印右子树的每个节点
        if(root.right!=null){
            printTree(root.right);
        }
    }
    private static class Node<T>{
        public T item;
        public Node left;
        public Node right;

        public Node(T item,Node left,Node right){
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }
}

















