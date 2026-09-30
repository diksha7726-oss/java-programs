public class Binarysearch3 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int low=0;
        int high=arr.length-1;
        int target=80;
        int count =0;
        while(low<=high){
            int mid=(low + high)/2;
            if(target==arr[mid]){
                System.out.println("Target element found: " + mid);
                count++;
                break;
            }
            else if(target > mid){
                low=mid+1;
                count++;
            }
            else {
                high=mid-1;
                count++;
            }
        }
        System.out.println("Comparisons: " + count);
    }
    
}
