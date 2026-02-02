import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionApp {

    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // Grid layout for alignment

        // Create Components
        JLabel label1 = new JLabel("  Num1:");
        JTextField textNum1 = new JTextField();

        JLabel label2 = new JLabel("  Num2:");
        JTextField textNum2 = new JTextField();

        JLabel labelResult = new JLabel("  Result:");
        JTextField textResult = new JTextField();
        textResult.setEditable(false); // Result field should be read-only

        JButton divideBtn = new JButton("Divide");

        // Add components to Frame
        frame.add(label1);
        frame.add(textNum1);
        frame.add(label2);
        frame.add(textNum2);
        frame.add(labelResult);
        frame.add(textResult);
        frame.add(new JLabel("")); // Empty placeholder
        frame.add(divideBtn);

        // Add Action Listener to Button
        divideBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse inputs
                    String s1 = textNum1.getText();
                    String s2 = textNum2.getText();

                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);

                    // Check for division by zero manually to throw exception or let Java handle it
                    if (n2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }

                    // Perform division
                    int res = n1 / n2;
                    textResult.setText(String.valueOf(res));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers only!",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by Zero!",
                            "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}