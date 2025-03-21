/*
import javax.swing.JOptionPane;
public class ex61 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want change to first class ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
*/

import javax.swing.JOptionPane;

public class ex61 {
    public static void main(String[] args) {
        Object[] options = { "I do", "I don't" };
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to first-class ticket?",
                "Option",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switch (option) {
            case 0:
                JOptionPane.showMessageDialog(null, "You have chosen Yes");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "You have chosen No");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You closed the dialog without choosing");
                break;
        }
    }
}
