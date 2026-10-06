import java.util.Scanner;
public class Insert {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int low =0;
        int high = arr.length-1;
        while(low <= high){
            int mid =(low + high)/2;
            if(target > arr[mid]){
                 low= mid +1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(low);
        
    }
    
}
