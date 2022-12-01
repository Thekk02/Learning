package TheBasics.day8;

public class GenericDemo02 {
    public static void main(String[] args) {
        Generic02<String> g1 = new Generic02<String>();
        g1.setT("a");
        Generic02<Integer> g2 = new Generic02<Integer>();
        g2.setT(234);
        Generic02<Boolean> g3 = new Generic02<Boolean>();
        g3.setT(true);
        System.out.println(g1.getT());
        System.out.println(g2.getT());
        System.out.println(g3.getT());
    }
}
