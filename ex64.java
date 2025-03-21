import java.util.Scanner;

public class ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strMonth;
        int year;
        while (true) {
            System.out.println("Enter month: ");
            strMonth = sc.next();
            System.out.println("Enter year: ");
            year = sc.nextInt();

            if (year < 0) {
                System.out.println("Invalid year. Please try again.");
                continue;
            }
            break;
        }

        switch (strMonth){
            case "1", "3", "5", "7", "8", "10", "12":
            case "January", "March", "May", "July", "August", "October", "December":
            case "Jan.", "Mar.", "Aug.", "Oct.", "Dec.":
            case "Jan", "Mar", "Jul", "Aug", "Oct", "Dec": {
                System.out.println("31 days");
                break;
            }

            case "4", "6", "9", "11":
            case "April", "June", "September", "November":
            case "Apr.", "Sept.", "Nov.":
            case "Apr", "Jun", "Sep", "Nov": {
                System.out.println("30 days");
                break;
            }
            case "2", "February", "Feb.", "Feb": {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("29 days");
                else System.out.println("28 days");
            }
        }
        System.exit(0);
    }
}
