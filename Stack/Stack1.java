import java.util.Stack;
public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> n=new Stack<Integer>();
        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);
        n.push(5);
        System.out.println(n);
        while(!n.isEmpty()){
            System.out.println(n.pop());
        }
    }  
}
