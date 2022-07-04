import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) {
        int count = n;
        for (int i = n; i > 0; i--) {
            int num = n;
            for (int j = n; j > 0; j--) {
                for (int k = count; k > 0; k--) {
                    System.out.print(num + " ");
                }
                num--;
            }
            count--;
            System.out.println();
        }
    }
}
