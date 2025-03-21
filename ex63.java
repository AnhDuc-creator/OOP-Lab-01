import java.util.Scanner;
public class ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n - i; j++) System.out.print(" ");
            for (j = 1; j <= 2*i -1; j++) System.out.print("*");
            System.out.println();
        }
        System.exit(0);
    }
}