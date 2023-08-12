import java.util.*;
//when order of array is not known
public class AgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int arr[] = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        System.out.println("enter the value you wantto search from the array:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
