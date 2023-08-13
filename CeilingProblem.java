public class CeilingProblem {
    //ceiling means:smallest no. which is greater than or equal to target;
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=21;
        int value=binarySearch(arr, target);
        System.out.println(value);
    }
    static int binarySearch(int[] arr,int target)
    {
        if(target>arr[arr.length-1])//if the target is greater than the greatest element in the array;
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
        return arr[start];
    }
}
