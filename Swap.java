import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
                num[i]=sc.nextInt();
        } 
        for(int i=0;i<5;i++)
        {
                System.out.println(num[i]);
        } 
        System.out.println("enter the index valuew to be swaaped");
        int index1=sc.nextInt();
        int index2=sc.nextInt();
      swap(num, index1, index2);
      for(int i=0;i<5;i++)
        {
                System.out.println(num[i]);
        } 
        
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
