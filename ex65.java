import java.util.Scanner;
import java.util.Arrays;

public class ex65 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        double sum = 0;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / n);
    }
}
