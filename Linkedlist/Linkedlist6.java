import java.util.LinkedList;
public class Linkedlist6 {
    public static void main(String[] args){
        LinkedList<String> stack=new LinkedList<String>();
        stack.push("page1");
        stack.push("page2");
        stack.push("page3");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    
}
