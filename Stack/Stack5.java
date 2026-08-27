import java.util.Stack;
public class Stack5 {
    public static void main(String[] args){
    Stack<Integer> arr= new Stack<Integer>();
    arr.push(5);
    arr.push(10);
    arr.push(45);
    arr.push(55);
    Stack<Integer> reverse=new Stack<Integer>();
    while(!arr.isEmpty()){
        reverse.push(arr.pop());
    }
    System.out.println(reverse);
}
}
