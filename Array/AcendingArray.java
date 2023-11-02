import java.util.Scanner;

public class AcendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numb = new int[size];
        for (int i = 0; i < size; i++) {
            numb[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < numb.length - 1; i++) // termination
        {
            if (numb[i] > numb[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("the array is sorted");
        } else {
            System.out.println("The array is not in ascending order");
        }
    }
}
