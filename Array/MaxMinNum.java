import java.util.*;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numb = new int[size];
        for (int i = 0; i < size; i++) {
            numb[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min) {
                min = numb[i];
            }
            if (numb[i] > max) {
                max = numb[i];
            }
        }
        System.out.println("largest num is:" + max);
        System.out.println("Smallest num is:" + min);
    }
}
