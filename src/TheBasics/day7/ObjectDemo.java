package TheBasics.day7;

/**
 * 建议所有子类重写tostring方法
 *
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("ren");
        s.setAge(18);
        System.out.println(s);// TheBasics.day7.ObjectDemoTheBasics.day7.Student@14ae5a5
        //println方法实现：
        //    public void println(Object x) {
        //        String s = String.valueOf(x);
        //        synchronized (this) {
        //            print(s);
        //            newLine();
        //        }
        //    }
        System.out.println(s.toString());
    }
}
