public class Binarysearch4 {
    public static void main(String[] args){
        int[] arr={10,30,40,60,5};
        boolean value=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                value=false;
                break;    
            }
        }
        if(value){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Array is unsorted");


        
    }
    
}
