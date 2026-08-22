import java.util.ArrayList;
public class Collections2 {
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        int sum=0;
        for(int n:num){
            sum +=n;
        }
        System.out.println("Sum of the array: " + sum);
    }
    
}
