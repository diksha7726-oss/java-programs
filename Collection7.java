import java.util.ArrayList;
import java.util.LinkedHashSet;
public class Collection7{
    public static void main(String[] args){
        ArrayList<Integer> n=new ArrayList<Integer>();
        n.add(20);
        n.add(25);
        n.add(30);
        n.add(35);
        n.add(25);
        n.add(30);
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(n);
        System.out.println(set);
    }
    
}
