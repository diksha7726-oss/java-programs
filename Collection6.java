import java.util.ArrayList;
import java.util.Collections;
public class Collection6 {
    public static void main(String[] args){
        ArrayList<String> sname=new ArrayList<String>();
        sname.add("Priyanka");
        sname.add("Diksha");
        sname.add("Anisha");
        sname.add("Dhanu");
        sname.add("Midhulya");
        Collections.sort(sname);
        System.out.println(sname);

    }
}
