import java.util.LinkedList;
import java.util.Queue;
public class Linkedlist10 {
    public static void main(String[] args){
        Queue<String> doc=new LinkedList<String>();
        doc.add("pdf");
        doc.add("jpg");
        doc.add("docxx");
        doc.add("ppt");
        doc.add("img");
        for(int i=0;i<5;i++){
            System.out.println(doc.poll());
            System.out.println("Documents left: " + doc.size());
        }
    }
    
}
