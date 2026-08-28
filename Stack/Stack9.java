import java.util.Stack;
public class Stack9 {
    public static void main(String[] args){
        Stack<Integer> exp=new Stack<Integer>();
        exp.push(3);
        exp.push(4);
        int a=exp.pop();
        int b=exp.pop();
        int result=a+b;
        System.out.println(result);

    }
    
}
