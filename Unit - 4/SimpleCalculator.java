import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {

    // Global variables to store calculator state
    static double num1 = 0, num2 = 0, result = 0;
    static char operator;

    public static void main(String[] args) {
        // Create the main Frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create Text Field to display results
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        // Create Panel for Buttons with Grid Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4 rows, 4 cols, gaps

        // Array of button labels
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "%", "=", "+"
        };

        // Add buttons to panel and attach listeners
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();

                    // If command is a digit
                    if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                        textField.setText(textField.getText() + command);
                    }
                    // If command is an operator
                    else if (command.equals("=")) {
                        try {
                            num2 = Double.parseDouble(textField.getText());

                            switch (operator) {
                                case '+':
                                    result = num1 + num2;
                                    break;
                                case '-':
                                    result = num1 - num2;
                                    break;
                                case '*':
                                    result = num1 * num2;
                                    break;
                                case '%':
                                    result = num1 % num2;
                                    break;
                                case '/':
                                    if (num2 == 0)
                                        throw new ArithmeticException();
                                    result = num1 / num2;
                                    break;
                            }
                            textField.setText(String.valueOf(result));
                        } catch (ArithmeticException ex) {
                            textField.setText("Error: Div by 0");
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    }
                    // Store the first number and the operator
                    else {
                        if (!textField.getText().isEmpty()) {
                            num1 = Double.parseDouble(textField.getText());
                            operator = command.charAt(0);
                            textField.setText("");
                        }
                    }
                }
            });
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}