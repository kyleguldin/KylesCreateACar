/**
	File name: ButtonMenu.java
	Short description: FILL THIS IN
	IST 242 Assignment:  Enter Assignment # here
	@author Kyle Guldin
	@version 1.01 2014-08-25
	Date: 
*/

package View;
import Controller.ButtonMenuController;
import java.awt.Color;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
*
*@author Kyle Guldin
import java.util.Scanner;
**/

public class ButtonMenu extends JPanel {
    
    JButton lookup, submit, cancel, truck, sedan, blue, red, grey, highTint, lowTint, exit;
    ButtonMenuController controller;
    OpeningWindow mainWindow;
    
    public ButtonMenu(OpeningWindow wnd) {
        this.mainWindow = wnd;
        this.lookup = new JButton("Switch");
        this.submit = new JButton("Submit");
        this.cancel = new JButton("Cancel");
        this.truck = new JButton("Truck");
        this.sedan = new JButton("Sedan");
        this.blue = new JButton("Blue");
        this.red = new JButton("Red");
        this.grey = new JButton("Grey");
        this.highTint = new JButton("High Tint");
        this.lowTint = new JButton("Low Tint");
        this.exit = new JButton("Exit");
        this.setLayout(new BoxLayout(this, Y_AXIS) );
        this.add(this.lookup);
        this.add(this.submit);
        this.add(this.cancel);
        this.add(this.truck);
        this.add(this.sedan);
        this.add(this.blue);
        this.add(this.red);
        this.add(this.grey);
        this.add(this.highTint);
        this.add(this.lowTint);
        this.add(this.exit);
        
        // instantiate the controller
        this.controller = new ButtonMenuController( this );
        this.lookup.addActionListener( this.controller );
        this.submit.addActionListener( this.controller );
        this.cancel.addActionListener( this.controller );
        this.truck.addActionListener( this.controller );
        this.sedan.addActionListener( this.controller );
        this.blue.addActionListener( this.controller );
        this.red.addActionListener( this.controller );
        this.grey.addActionListener( this.controller );
        this.highTint.addActionListener( this.controller );
        this.lowTint.addActionListener( this.controller );
        this.cancel.addActionListener( this.controller );
        this.setBackground(Color.CYAN);
    }
    public void swtichCarImage() {
        this.mainWindow.switchCarImage();
    }
}
