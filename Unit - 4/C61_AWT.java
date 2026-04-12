// 61.  Write a Program to Develop a Java-based AWT Calculator that accepts two numbers from 
// user & performs arithmetic operations (addition, subtraction, multiplication, & division) 
// using buttons. Display the result in a label as shown in below fig. Handle invalid inputs & 
// division by zero. 

import java.awt.*;
import java.awt.event.*;

public class C61_AWT extends Frame implements ActionListener {
    Label l1, l2, resultLabel;
    TextField t1, t2;
    Button add, sub, mul, div;

    public C61_AWT() {
        setTitle("AWT Calculator");
        setSize(400, 250);
        // FlowLayout → Arranges components left to right
        setLayout(new FlowLayout());

        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        resultLabel = new Label("Result: ");

        t1 = new TextField(15);
        t2 = new TextField(15);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Add Components to Frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(resultLabel);

        // Register Event Listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Handles closing of window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // dispose() → closes the application
                dispose();
            }
        });

        setVisible(true);
    }

    // This method runs when any button is clicked.
    public void actionPerformed(ActionEvent e) {
        try {
            // Converts String → double
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            // Checks which button is clicked
            if (e.getSource() == add) {
                result = num1 + num2;
            } else if (e.getSource() == sub) {
                result = num1 - num2;
            } else if (e.getSource() == mul) {

                result = num1 * num2;
            } else if (e.getSource() == div) {
                if (num2 == 0) {
                    resultLabel.setText("Result: Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
            }

            resultLabel.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        C61_AWT cal = new C61_AWT();
    }
}
