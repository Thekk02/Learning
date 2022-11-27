package DataStructure.datastructure.test;

import DataStructure.datastructure.Stack;

public class ReversePolishNotationTest {
    public static void main(String[] args) {
        //中缀表达式 3*（17-15） + 18/6的逆波兰表达式如下
        String[] notation = {"3","17","15","-","*","18","6","/","+"};
        int result = calculate(notation);
        System.out.println("逆波兰表达式的结果为："+result);
    }
    /**
     * @param notation 逆波兰表达式的数组表达方式
     * @return 逆波兰表达式的计算结果
     * */
    public static int calculate(String[] notation){
        //1.创建栈对象,用来存储操作数
        Stack<Integer> oprands = new Stack<>();
        //2.从左往右遍历逆波兰表达式，得到每一个元素
        //3.判断当前元素是运算符还是操作数
        //4.如果是运算符，从栈中弹出两个操作数，完成运算，运算完的结果再压入到栈中
        for(int i=0;i<notation.length;i++){
            String curr = notation[i];
            Integer o1;
            Integer o2;
            Integer result;
            switch(curr){
                case"+":
                     o1 = oprands.pop();
                     o2 = oprands.pop();
                     result = o1 + o2;
                    oprands.push(result);
                    break;
                case"-":
                     o1 = oprands.pop();
                     o2 = oprands.pop();
                     result = o2 - o1;
                    oprands.push(result);
                    break;
                case"*":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o1 * o2;
                    oprands.push(result);
                    break;
                case"/":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o2 / o1;
                    oprands.push(result);
                    break;
                default:
                    //5.操作数，把操作数放入栈中；
                    oprands.push(Integer.parseInt(curr));
                    break;
            }
        }

        //6.得到栈中最后一个元素就是逆波兰表达式的劫结果
        int result = oprands.pop();
        return result;
    }
}



