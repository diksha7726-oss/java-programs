public class Occurrence1 {
    public static void main(String[] args){
        int[] arr ={10,20,20,20,30,40,50};
        int target=20;
        int low=0;
        int high=arr.length-1;
        int mid1=-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target==arr[mid]){
                mid1=mid;
                high=mid -1;
            }
            else if(target > arr[mid])
                low=mid +1;
            else
                high = mid -1;
        }
        System.out.println(mid1);
    }
    
}
