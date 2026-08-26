import java.util.ArrayList;
public class Collection10 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(25);
        list.add(55);
        list.add(40);
        list.add(43);
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even =new ArrayList<Integer>();
        for(int n: list){
            if(n %2 ==0)
                even.add(n);
            else
                odd.add(n);
        }
        System.out.println(odd);
        System.out.println(even);





    }
    
}
