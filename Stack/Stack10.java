import java.util.Stack;
public class Stack10 {
    public static void main(String[] args){
        String s="{[()]}";
        Stack<Character> exp=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '(' || ch=='[' || ch=='{')
                exp.push(ch);
            else if(ch==')' || ch==']' || ch=='}'){
                if(exp.isEmpty())
                    System.out.println("Not balanced");
                char top=exp.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[')||(ch=='}' && top!='{'))
                    System.out.println("Not balanced");
            }
        }
        if(exp.isEmpty())
            System.out.println("Balaced");
        else
            System.out.println("Not balanced");
    }
    
}
