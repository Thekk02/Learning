package DataStructure.algorithm.sort;
/*接口comparable介绍
1.定义学生类Student，具有年龄和uesrname连个属性，并通过接口类comparable接口提供比较规则。

 */
public class Student implements Comparable<Student>{
    private String username;
    private int age;
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
            return "Student{" +
                    "username='" + username + '\'' +
                    ",age" + age +
                    '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
