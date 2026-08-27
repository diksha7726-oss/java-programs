import java.util.Stack;
public class Stack2 {
    public static void main(String[] args){
        Stack<String> city=new Stack<String>();
        city.push("chennai");
        city.push("coimbatore");
        city.push("madurai");
        city.push("Trichy");
        System.out.println(city.peek());
        System.out.println(city.pop());
        System.out.println(city.pop());
    }
    
}
