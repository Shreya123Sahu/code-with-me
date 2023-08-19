import java.util.Arrays;
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {   int i=0;
        while (i<arr.length) {
            int check=arr[i]-1;
            if(arr[i]!=arr[check])
            {
                int temp=arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else
            i++;
        }
        {
            
        }
    }
}
