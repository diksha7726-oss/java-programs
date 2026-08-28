import java.util.Stack;
public class Stack6 {
    public static void main(String[] args){
        Stack<Character> str=new Stack<Character>();
        String s="madam";
        for(int i=0;i<s.length();i++){
            str.push(s.charAt(i));
        } 
        Stack<Character> reverse = new Stack<Character>();
        while(!str.isEmpty()){
            reverse.push(str.pop());
        }
        String rev= "";
        while(!reverse.isEmpty()){
            rev=rev + reverse.pop();
        }
        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
    
}
