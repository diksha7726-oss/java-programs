import java.util.ArrayList;
import java.util.Collections;
public class Merge {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(15);
        list2.add(10);
        list1.addAll(list2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        
    }
    
}
