import java.util.LinkedList;
public class Linkedlist3 {
    public static void main(String[] args){
        LinkedList<String> color = new LinkedList<String>();
        color.add("Black");
        color.add("White");
        color.add("Pink");
        color.add("Blue");
        color.add("Violet");
        color.removeFirst();
        color.removeLast();
        System.out.println(color);
    }
    
}
