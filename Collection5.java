import java.util.ArrayList;
public class Collection5 {
    public static void main(String[] args){
    ArrayList<Integer> marks=new ArrayList<Integer>();
    marks.add(78);
    marks.add(88);
    marks.add(79);
    marks.add(93);
    marks.add(65);
    int max=marks.get(0);
    for(int m:marks){
        if(m>max)
            max=m;
    }
    System.out.println("Maximum Mark: " + max);
    }
}
