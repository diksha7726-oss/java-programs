import java.util.LinkedList;
public class Linkedlist2 {
    public static void main(String[] args){
        LinkedList<Integer> num=new LinkedList<Integer>();
        num.add(34);
        num.add(45);
        num.add(56);
        num.addFirst(10);
        num.addFirst(20);
        num.addFirst(30);
        num.addLast(78);
        num.addLast(89);
        num.addLast(99);
        System.out.println(num);
    }
    
}
