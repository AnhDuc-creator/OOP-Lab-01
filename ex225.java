import javax.swing.JOptionPane;
public class ex225 {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog("Enter the first number: ");
        strNum2 = JOptionPane.showInputDialog("Enter the second number: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum =  num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double div = num1 / num2;

        if (num2 != 0)
            JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe difference is: " + diff +  "\nThe product is: " + product + "\nThe division is: " + div);
        else
            JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe difference is: " + diff +  "\nThe product is: " + product + "\nThe division is undefined");
        System.exit(0);
    }
}