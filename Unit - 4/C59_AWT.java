import java.awt.*;
import java.awt.event.*;

class C59_AWT {
    public static void main(String args[]) {
        Frame f = new Frame("My Frame");
        f.setLayout(new GridLayout(3, 2, 10, 10));
        Label l1 = new Label("First");
        Label l2 = new Label("Second");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button b = new Button("OK");
        // Add components
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(new Label(""));
        f.add(b);
        // Swap Logic on Button Click
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
        f.setSize(300, 200);
        f.setVisible(true);
        // Close window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}