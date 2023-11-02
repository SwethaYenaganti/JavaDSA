import java.util.*;

public class BubbleSort {
    public static void PrintArray(int MyArray[]) {
        for (int i = 0; i < MyArray.length; i++) {
            System.out.print(MyArray[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int MyArray[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < MyArray.length - 1; i++) {
            for (int j = 0; j < MyArray.length - i - 1; j++) {
                if (MyArray[j] > MyArray[j + 1]) {
                    int temp = MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j + 1] = temp;
                }
            }
            PrintArray(MyArray);
        }
    }
}