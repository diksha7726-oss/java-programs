import java.util.LinkedList;
public class Linkedlist1 {
    public static void main(String[] args){
        LinkedList<String> subject = new LinkedList<String>();
        subject.add("Compiler Design");
        subject.add("Operating system");
        subject.add("Data science");
        subject.add("Cryptography");
        System.out.println(subject.getFirst());
        System.out.println(subject.getLast());
    }
    
}
