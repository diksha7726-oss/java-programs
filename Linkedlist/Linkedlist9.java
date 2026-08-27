import java.util.LinkedList;
import java.util.Scanner;
public class Linkedlist9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> name=new LinkedList<String>();
        for(int i=0;i<5;i++){
            String name1=sc.nextLine();
            name.add(name1);
        }
        LinkedList<Integer> mrk=new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            int marks=sc.nextInt();
            mrk.add(marks);
        }
        LinkedList<Object> merge=new LinkedList<Object>();
        merge.addAll(name);
        merge.addAll(mrk);
        System.out.println(merge);
    }
    
}
