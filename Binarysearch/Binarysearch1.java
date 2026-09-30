public class Binarysearch1{
    public static void main(String[] args){
        int[] a = {10,20,30,40,50,60,70};
        int target=50;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==a[mid]){
                System.out.println("Target:  " + target);
                break;
            }
            else if(target>a[mid])
                low=mid +1;
            else 
                high=mid -1;
        }
        
    }
}