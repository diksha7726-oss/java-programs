public class Occurrence3 {
    public static void main(String[] args){
        int[] arr = {10,20,20,20,30,30,40};
        int low=0;
        int high=arr.length-1;
        int target =20;
        int first=-1;
        int last=-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                first = mid;
                high = mid -1;
            }
            else if(target > arr[mid]){
                low =mid + 1;
            }
            else
                high = mid -1;
        }
        while(low <= high){
            int mid =(low + high)/2;
            if(target == arr[mid]){
                last = mid;
                low = mid +1;
            }
            else if(target > arr[mid]){
                low = mid +1;
            }
            else 
                high = mid -1;
        }
        int count = (first-last)+ 1;

        System.out.println("Occurrences : " + count);
    }
    
}
