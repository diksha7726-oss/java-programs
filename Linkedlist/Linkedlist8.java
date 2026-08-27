import java.util.LinkedList;
public class Linkedlist8 {
    public static void main(String[] args){
        LinkedList<Integer> n=new LinkedList<Integer>();
        n.add(10);
        n.add(20);
        n.add(35);
        n.add(95);
        int sum=0;
        for(int num: n ){
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }   
}
