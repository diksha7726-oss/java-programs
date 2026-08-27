import java.util.Stack;
public class Stack4 {
    public static void main(String[] args){
        Stack<Integer> num=new Stack<Integer>();
        num.push(10);
        num.push(20);
        num.push(30);
        num.push(40);
        num.push(50);
        num.push(60);
        num.push(70);
        num.push(80);
        num.push(90);
        num.push(100);
        System.out.println(num.size());
        for(int i=num.size()-1;i>=3;i--){
            System.out.println(num.pop());
        }
    }
    
}
