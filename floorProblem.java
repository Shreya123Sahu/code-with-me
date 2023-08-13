public class floorProblem {
    //FLoor means:Greatest no.which is smaller than equal tothe target;
   public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=33;
        int value=binarySearch(arr, target);
        System.out.println(value);
    }
    static int binarySearch(int[] arr,int target)
    {
        if(target<arr[0])    //if the target is smaller than the smallest elemnt in the array;
        return -1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        
            
        }
        return arr[end];
    }
}
