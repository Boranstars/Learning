import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = ((scanner.nextInt()) - 1) / 2;
        for (int i = 1; i <= N; i++) {
            printaaa(N, i);
        }
        for (int i = 1; i <= 2*N+1; i++) {
            System.out.print("* ");
        }
        System.out.print('\n');
        for (int i = N;i >=1 ; i--) {
            printaaa(N, i);
        }

        scanner.close();
    }

    private static void printaaa(int n, int i) {
        for (int j = n - i; j >= 0; j--) {
            System.out.print("  ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }


}