public class Binarysearch5 {
    public static void main(String[] args){
        int[] arr = {90,80,70,60,50,40,30,20};
        int low=0;
        int high=arr.length-1;
        int target=30;
        while(low <= high){
            int mid =(low + high)/2;
            if(target == arr[mid]){
                System.out.println("Target element : " + arr[mid]);
                break;
            }
            else if(target > arr[mid])
                high = mid -1;
            else 
                low = mid + 1;
        }
        
    }

    
}
