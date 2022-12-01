package TheBasics.day8;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student (){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {
/*        return 0不存储
                1升序
                -1  降序 */
        int num = this.age - s.age;
        //年龄相同比较姓名的字母怒排列顺序
        int num2 = num == 0?this.name.compareTo(s.name):num;
        return num;
    }
}
