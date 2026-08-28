import java.util.Stack;
public class Stack7 {
    public static void main(String[] args){
        Stack<String> page=new Stack<String>();
        page.push("google");
        page.push("youtube");
        page.push("github");
        page.push("linkedin");
        page.push("claude");
        for(int i=0;i<3;i++){
            System.out.println(page.pop());
        }
        System.out.println(page);
        
    }
    
}
