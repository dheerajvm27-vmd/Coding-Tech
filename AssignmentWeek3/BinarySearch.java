package AssignmentWeek3;
public class BinarySearch {
    static int binarySearchRec(int arr[], int low, int high, int key){
        if(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                return binarySearchRec(arr,mid+1,high,key);
            else
                return binarySearchRec(arr,low,mid-1,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=5;
        // Iterative
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Iterative Found at index "+mid);
                break;
            }
            else if(arr[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        // Recursive
        int result=binarySearchRec(arr,0,arr.length-1,key);
        System.out.println("Recursive Found at index "+result);
    }
}
