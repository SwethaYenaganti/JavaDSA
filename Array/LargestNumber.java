public class LargestNumber {
    public static int largestnum(int arr[]) {
        int largenum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largenum) {
                largenum = arr[i];
            }
        }
        return largenum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 25, 12, 14, 16 };
        largestnum(arr);
    }
}
