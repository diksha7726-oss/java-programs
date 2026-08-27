import java.util.LinkedList;
public class Linkedlist7 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        LinkedList<Integer> reversed=new LinkedList<Integer>();
        for(int i=list.size()-1;i>=0;i--){
            reversed.add(list.get(i));
        }    
        System.out.println(reversed);
    }   
}
