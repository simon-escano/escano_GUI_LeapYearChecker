import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JPanel jpanel;
    private JPanel container;
    private JPanel lblInputBox;
    private JButton btnCheckYear;
    private JTextField tfYear;
    private JPanel tfYearBox;
    private JLabel lblInput;

    public GUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year;
                try {
                    year = Integer.parseInt(tfYear.getText());
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "That is not a valid year");
                    return;
                }
                if (year % 400 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else if (year % 100 == 0) {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                } else if (year % 4 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        GUI app = new GUI();
        app.setContentPane(app.jpanel);
        app.setSize(400, 250);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
