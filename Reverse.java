import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("enter the index valuew to be swaaped");
        int start = 0;
        int end = num.length - 1;
        swap(num, start, end);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }

    static void swap(int[] arr, int Start, int end) {
        for (int i = 0; i < arr.length; i++) {
            if (Start < end) {
                int temp = arr[Start];
                arr[Start] = arr[end];
                arr[end] = temp;
            }
            Start++;
            end--;
        }

    }
}
