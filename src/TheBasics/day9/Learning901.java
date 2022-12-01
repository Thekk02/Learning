package TheBasics.day9;

import java.io.File;
import java.io.IOException;

/**
 * File类：是文件和路径名的抽象表示
 * 创建方法：
 * boolean createNewFile():当且仅当具有该名称的文件尚不存在时，
 * 原子地创建一个由该抽象路径名命名的新的空文件。
 * boolean mkdir():创建由此抽象路径名命名的目录。
 * boolean mkdirs:创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
 *
 *
 *
 */
public class Learning901 {
    public static void main(String[] args) throws IOException {
        //三个构造方法：
        File f1 = new File("E:\\docunmention\\java.txt");

        File f2 =  new File("E:\\docunmention","java.txt");

        File f3 = new File("E:\\docunmention");
        File f4 = new File(f3,"java.txt");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f4);


        //在当前模块下创建文件：
        File f5 = new File("Learing\\java.txt");
        System.out.println(f1.createNewFile());
    }
}










