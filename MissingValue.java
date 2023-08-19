import java.util.Arrays;
public class MissingValue {
    public static void main(String[] args) {
        int[] arr={3,4,0,2,1};
        int ans=cyclicsort(arr);
        System.out.print(ans);
        
        
     

    }
    static  int cyclicsort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int check=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[check])
            {
                int temp=arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else 
            i++;
        }
        for(int index=0;index<arr.length;index++)
        {
            if(index!=arr[index])
            return index;
        }
        return arr.length;
    }
}

