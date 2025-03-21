import javax.swing.JOptionPane;
public class ex226  {
    public static void main(String[] args) {
        String strChoice = JOptionPane.showInputDialog("Choose the type of operation: \n1. The first-degree equation (linear equation) with one variable\n2. The system of first-degree equations (linear system) with two variables\n3. The second-degree equation with one variable");
        int choice = Integer.parseInt(strChoice);
        switch (choice) {
            case 1:{
                String strA = JOptionPane.showInputDialog("Enter a: ");
                double a = Double.parseDouble(strA);
                String strB = JOptionPane.showInputDialog("Enter b: ");
                double b = Double.parseDouble(strB);
                if (a != 0){
                    JOptionPane.showMessageDialog(null, "The solution is " + (-b/a));
                }
                else if (b != 0){
                    JOptionPane.showMessageDialog(null, "No solution");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Infinite solution");
                }
                break;
            }
            case 2:{
                String strA11 = JOptionPane.showInputDialog("Enter a11: ");
                double a11 = Double.parseDouble(strA11);
                String strA12 = JOptionPane.showInputDialog("Enter a12: ");
                double a12 = Double.parseDouble(strA12);
                String strB1 = JOptionPane.showInputDialog("Enter b1: ");
                double b1 = Double.parseDouble(strB1);
                String strA21 = JOptionPane.showInputDialog("Enter a21: ");
                double a21 = Double.parseDouble(strA21);
                String strA22 = JOptionPane.showInputDialog("Enter a22: ");
                double a22 = Double.parseDouble(strA22);
                String strB2 = JOptionPane.showInputDialog("Enter b2: ");
                double b2 = Double.parseDouble(strB2);

                double D = a11*a22 - a12*a21;
                double D1 = b1*a22 - b2*a12;
                double D2 = b2*a11 - b1*a21;

                if (D != 0) {
                    double x1 = D1/D;
                    double x2 = D2/D;
                    JOptionPane.showMessageDialog(null, "Solutions are " + x1 + " and " + x2);
                }
                else if (D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "Infinite solution");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No solution");
                }
                break;
            }
            case 3:{
                String strA = JOptionPane.showInputDialog("Enter a: ");
                double a = Double.parseDouble(strA);
                String strB = JOptionPane.showInputDialog("Enter b: ");
                double b = Double.parseDouble(strB);
                String strC = JOptionPane.showInputDialog("Enter c: ");
                double c = Double.parseDouble(strC);

                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "Not a quadratic equation");
                }
                else {
                    double delta = b*b - 4*a*c;
                    if (delta < 0) {
                        JOptionPane.showMessageDialog(null, "No solution");
                    }
                    else if (delta == 0) {
                        JOptionPane.showMessageDialog(null, "The equation has 1 solution: " + (-b/(2*a)));
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "The equation has 2 solutions: " + ((-b + Math.sqrt(delta))/(2*a)) + ", " + ((-b - Math.sqrt(delta))/(2*a)));
                    }
                }
                break;
            }
        }
        System.exit(0);
    }
}