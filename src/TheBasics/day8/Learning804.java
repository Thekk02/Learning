package TheBasics.day8;

/**
 * 泛型：jdk5引入特性
 * 本质上是参数化类型
 * 将类型由原来具体的类型参数化，然后再使用/调用的时候传入具体类型：
 * 实参的类型只能是引用类型：
 *
 * 好处：
 * 把运行时的问题提前到了编译期间
 * 避免了强制类型转换。
 *
 * 泛型类：
 *定义：public class Generic<T>{}T可以为任意标识，常见的由T，E，K，V等形式的参数用于表示泛型
 *
 * 泛型方法：
 * 定义格式：public <T> void show(T t){}
 *
 * 泛型接口：
 *定义格式：public interface Generic<T> {}
 *
 * 类型通配符：为了表示各种泛型List的父类，可以使用通配符<?>
 *     List<?>表示元素类型未知的List，他的元素可以匹配任意的类型
 *     这种带通配符的List仅表示他是各种泛型List的父类，不能把元素添加到其中。
 *     如果我们不希望List<?>示他是各种泛型List的父类，只希望它代表某一类泛型List的父类，可以使用类型通配符的上线
 *     类型通配符上限：<? extends 类型>
 *         List<? extends number> 表示的类型是Number或者其子类型
 *
 *         同理可以指定其下限
 *         类型通配符上限：<? super 类型>
 *         List<? super number> 表示的类型是Number或者其父类型
 *
 *
 * 可变参数：可变参数又称参数个数可变，用作方法的形参出现，那么方法参数的个数就是可变的了
 *      格式：public static int sum(int...a){}
 *
 * 可变参数的使用：
 *      Arrays工具类中的静态方法：
 *      public static <T> List <T> asList(T...a):
 *      返回由指定数组支持的固定大小的列表
 *
 *      List接口中的静态方法：
 *      public static <E> List<E> of(E...elements):
 *      返回包含任意数量元素的不可变列表
 *
 *      Set接口中的静态方法：
 *      public static <E> Set<E> of(E...elements):
 *      返回一个包含任意数量元素的不可变集合
 *
 */
public class Learning804 {

}
