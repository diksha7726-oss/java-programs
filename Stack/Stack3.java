import java.util.Stack;
public class Stack3 {
    public static void main(String[] args){
        Stack<Integer> num=new Stack<Integer>();
        System.out.println(num.isEmpty());
        num.push(20);
        num.push(30);
        System.out.println(num.isEmpty());
    }  
}
