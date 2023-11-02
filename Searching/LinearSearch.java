import java.util.*;

//linear Search
public class LinearSearch {
    public static int liSearch(int numb[], int key) {
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numb[] = { 2, 4, 6, 8, 10, 12, 16 };
        int key = 10;
    }
}
