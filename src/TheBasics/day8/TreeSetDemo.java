package TheBasics.day8;
import java.util.Comparator;
import java.util.TreeSet;

//Comparable学习：
//Comparator学习：
public class TreeSetDemo {
    public static void main(String[] args) {
        //Comparable学习：
/*        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("xishi",12);
        Student s2 = new Student("wangzhaojun",13);
        Student s3 = new Student("diaochan",14);
        Student s4 = new Student("yangyuhuan",15);

*//*    ts.add(s1);
    ts.add(s2);
    ts.add(s3);
    ts.add(s4);*//*  //学生类必须实现Compara接口
    ts.add(s1);
    ts.add(s2);
    ts.add(s3);
    ts.add(s4);*/


        //Comparator学习：

        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("xishi",12);
        Student s2 = new Student("wangzhaojun",13);
        Student s3 = new Student("diaochan",14);
        Student s4 = new Student("yangyuhuan",15);

/*    ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);*/   //学生类必须实现Compara接口
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for(Student s:ts){
            System.out.println(s);
        }
    }
}
