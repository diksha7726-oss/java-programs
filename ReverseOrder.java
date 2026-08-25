import java.util.ArrayList;
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=5;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        for(int i=list.size()-1;i>=0;i--){
            reverse.add(list.get(i));    
        }
        System.out.println(reverse);
        

    }
    
}
