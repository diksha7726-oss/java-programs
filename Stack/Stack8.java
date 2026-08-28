import java.util.Stack;
public class Stack8 {
    public static void main(String[] args){
        Stack<Integer> num=new Stack<Integer>();
        int n=10;
        while(n>0){
            int rem=n % 2;
            num.push(rem);
            n=n/2;
        }
        System.out.println("Binary: ");
        while(!num.isEmpty()){
            System.out.println(num.pop());
        }
    } 
}
