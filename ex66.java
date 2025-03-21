import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        double[][] arr1 = new double[n][m];
        double[][] arr2 = new double[n][m];
        System.out.println("Enter matrix 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter matrix 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The sum is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
