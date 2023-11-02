public class SelectionSort {
    public static void PrintArray(int MyArray[]) {
        for (int i = 0; i < MyArray.length; i++) {
            System.out.print(MyArray[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int MyArray[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < MyArray.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < MyArray.length; j++) {
                if (MyArray[smallest] > MyArray[j]) {
                    smallest = j;
                }

            }
            int temp = MyArray[smallest];
            MyArray[smallest] = MyArray[i];
            MyArray[i] = temp;
        }
        PrintArray(MyArray);
    }
}
