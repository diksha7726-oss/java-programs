public class Rotatedsort {
    public static void main(String[] args){
        int[] arr={40,50,60,70,10,20,30};
        int target = 20;
        int low =0;
        int high=arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                System.out.println("Element at the index: " + mid);
                break;
            }
            else if(target < arr[mid])
                low = mid +1;
            else 
                high = mid -1;
        }
    }
    
}
