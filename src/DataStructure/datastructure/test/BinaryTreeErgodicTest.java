package DataStructure.datastructure.test;

import DataStructure.datastructure.BinaryTree;
import DataStructure.datastructure.Queue;


public class BinaryTreeErgodicTest {
    //前序遍历测试：
        //    public static void main(String[] args) {
        //        //创建树对象
        //        BinaryTree<String, String> tree = new BinaryTree<>();
        //        //在树中添加数据
        //        tree.put("E", "5");
        //        tree.put("B", "2");
        //        tree.put("G", "7");
        //        tree.put("A", "1");
        //        tree.put("D", "4");
        //        tree.put("F", "6");
        //        tree.put("H", "8");
        //        tree.put("C", "3");
        //        //遍历
        //        Queue<String> keys = tree.preErgodic();
        //        for (String key : keys) {
        //            String value = tree.get(key);
        //            System.out.println(key+"-----"+value);
        //        }
        //    }
    //中序遍历测试
        //    public static void main(String[] args) {
        //        //创建树对象
        //        BinaryTree<String, String> tree = new BinaryTree<>();
        //        //在树中添加数据
        //        tree.put("E", "5");
        //        tree.put("B", "2");
        //        tree.put("G", "7");
        //        tree.put("A", "1");
        //        tree.put("D", "4");
        //        tree.put("F", "6");
        //        tree.put("H", "8");
        //        tree.put("C", "3");
        //        //遍历
        //        Queue<String> keys = tree.midErgodic();
        //        for (String key : keys) {
        //            String value = tree.get(key);
        //            System.out.println(key+"-----"+value);
        //        }
        //    }
    //后续遍历测试
        //    public static void main(String[] args) {
        //        //创建树对象
        //        BinaryTree<String, String> tree = new BinaryTree<>();
        //        //在树中添加数据
        //        tree.put("E", "5");
        //        tree.put("B", "2");
        //        tree.put("G", "7");
        //        tree.put("A", "1");
        //        tree.put("D", "4");
        //        tree.put("F", "6");
        //        tree.put("H", "8");
        //        tree.put("C", "3");
        //        //遍历
        //        Queue<String> keys = tree.afterErgodic();
        //        for (String key : keys) {
        //            String value = tree.get(key);
        //            System.out.println(key+"-----"+value);
        //        }
        //    }
    public static void main(String[] args) {
        //创建树对象
        BinaryTree<String, String> tree = new BinaryTree<>();
        //在树中添加数据
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");
        //遍历
        Queue<String> keys = tree.layerErgodic();
        for (String key : keys) {
            String value = tree.get(key);
            System.out.println(key+"-----"+value);
        }
    }
    }

