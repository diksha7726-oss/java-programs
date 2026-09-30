public class Binarysearch2 {
    public static void main(String[] args){
        int[] a={10,20,30,40,50,60,70,80,90};
        int target=70;
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println(mid);
            if(target==a[mid]){
                System.out.println("Element found at index: " + mid);
                System.out.println(a[mid]);
                break;
            }
            else if(target>a[mid]){
                low=mid+1;
                System.out.println(low);
            }
            else{
                high=mid-1;
                System.out.println(high);
            }
        }
    }
    
}
