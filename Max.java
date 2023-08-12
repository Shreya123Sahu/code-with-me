import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
                num[i]=sc.nextInt();
        } 
        int result=max(num);
        System.out.println("the max number is:"+ result); 
    }
    static int max(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            max=arr[i];
            }
        return max;
    }
}
