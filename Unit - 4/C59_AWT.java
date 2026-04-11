import java.awt.*;  
import java.awt.event.*;  
  
class C59_AWT {  
    public static void main(String args[]) {  
  
        Frame f = new Frame("My Frame");  
        // Set GridLayout (3 rows, 2 columns)  
      //10,10 → horizontal & vertical gap between components  
          
     f.setLayout(new GridLayout(3, 2, 10, 10));  
  
        // Components  
        Label l1 = new Label("First");  
        Label l2 = new Label("Second");  
        TextField t1 = new TextField(10);  
        TextField t2 = new TextField(10);  
        Button b = new Button("OK");  
         
        // Add components (row-wise)  
        f.add(l1);  
        f.add(t1);  
        f.add(l2);  
        f.add(t2);  
  
        f.add(new Label("")); // empty space  
        f.add(b);  
  
        f.setSize(300, 200);  
        f.setVisible(true);  
  
        // Close window  
        f.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        });  
    }  
}  
