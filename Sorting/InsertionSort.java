import java.util.*;

public class InsertionSort {
    public static void PrintArray(int MyArray[]) {
        for (int i = 0; i < MyArray.length; i++) {
            System.out.print(MyArray[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int MyArray[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < MyArray.length; i++) {
            int Current = MyArray[i];
            int j = i - 1;
            while (j >= 0 && Current < MyArray[j]) {
                MyArray[j + 1] = MyArray[j];
                j--;
            }
            MyArray[j + 1] = Current;
        }
        PrintArray(MyArray);
    }
}
