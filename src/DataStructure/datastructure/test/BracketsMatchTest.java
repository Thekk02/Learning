package DataStructure.datastructure.test;

import DataStructure.datastructure.Stack;

public class BracketsMatchTest {
    public static void main(String[] args) {
        String str = "(上海长安)())";
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配："+ match);
    }
        /**
         * 判断str中的括号是否匹配
         * @param str 括号组成的字符串
         * @return 如果匹配，返回true，反之则返回false
         */
        public static boolean isMatch(String str){
            //1.创建栈对象，用来存储左括号
            Stack<String> chars = new Stack<>();
            //2.从左到右遍历字符串
            for(int i=0;i < str.length();i++){
                String currchar = str.charAt(i) + "";
                //3.判断当前字符是否为左括号，如果是，则把字符放入栈中
                if(currchar.equals("(")){
                    chars.push(currchar);
                }else if(currchar.equals(")")){
                    //4.判断当前字符是否是右括号，如果是，则从栈中弹出一个左括号，
                    // 并判断弹出的结果是否为null，如果为null则证明没有匹配的左括号
                    //如果不为null则证明有匹配的左括号
                    String pop = chars.pop();
                    if(pop==null){
                        return false;
                    }
                }
            }
            //判断栈中还有没有剩余的左括号，如果有，则证明括号不匹配
            if(chars.size()==0){
                return true;
            }else{
                return false;
            }
        }

}