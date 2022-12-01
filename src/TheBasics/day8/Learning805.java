package TheBasics.day8;

import java.util.HashMap;
import java.util.Map;

/**
 * Map：
 * InterFace Map<K,V> K:键的类型，V:值的类型
 * 将键映射到值的对象，不能包含重复的键，每个键可以映射到最多一个值
 * Map的基本功能：
 * get<key>根据建获取值
 * Set<K> keySet()获取所有键的集合
 * Collection<V> values()获取所有值的集合
 * Set<Map.Entry<K,V>> entrySet()获取所有键值对对象的集合
 *
 *
 * //map的遍历：
 *      1.先获取键的集合，然后根据键去找值。
 *      2.先获取所有键值对对象的集合，再遍历集合得到
 */
public class Learning805 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //增加对象是put,当键是第二次出现的时候就是修改
        map.put("r01","a");
        map.put("r02","b");
        map.put("r03","c");

        //输出
        System.out.println(map);
    }
}
