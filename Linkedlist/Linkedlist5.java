import java.util.LinkedList;
import java.util.Queue;
public class Linkedlist5 {
    public static void main(String[] args){
        Queue<String> customer  = new LinkedList<String>();
        customer.offer("Abi");
        customer.offer("Anu");
        customer.offer("Abu");
        customer.offer("Diksha");
        customer.offer("Varsh");
        while(!customer.isEmpty()){
            System.out.println(customer.poll());
        }
    }
    
}
