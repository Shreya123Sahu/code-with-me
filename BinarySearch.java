import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // for binarySearch Array should be always sorted:this array is in Ascending order;
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        System.out.println("enter the value you wantto search from the array:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else
            {
             return mid;
            }
        }
        return -1;
    }
}
