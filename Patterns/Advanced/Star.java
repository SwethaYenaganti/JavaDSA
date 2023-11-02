public class Star {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = n - 1; k < n; k--) {
                System.out.print("g");
            }
            System.out.println("f");
        }
    }
}
