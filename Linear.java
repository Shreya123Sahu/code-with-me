/*public class Linear {
    static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            if (element == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 4000;
        boolean result = linearSearch(arr, target);
        System.out.println(result);

    }
}*/
public class Linear{
    static boolean search(String str,char search){
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==search)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="Shreya";
        char search='u';
        System.out.println(search(str,search));

    }
}
