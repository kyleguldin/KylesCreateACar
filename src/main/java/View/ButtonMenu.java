/**
 * File name: ButtonMenu.java
 * Short description: FILL THIS IN
 * IST 242 Assignment:  Enter Assignment # here
 *
 * @author Kyle Guldin
 * @version 1.01 2014-08-25 Date:
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
 * @author Kyle Guldin import java.util.Scanner;
 *
 */
public class ButtonMenu extends JPanel {

    JButton lookup, submit, clear, truck, sedan, blue, red, grey, highTint, lowTint, exit;
    ButtonMenuController controller;
//    OpeningWindow mainWindow;
//    CarImage blueCars;

    public ButtonMenu(ButtonMenuController controller) {
        this.setSize(500, 500);
//        this.mainWindow = wnd;
        this.lookup = new JButton("Switch Car");//this creates new buttons
        this.submit = new JButton("Submit");
        this.clear = new JButton("clear");
        this.truck = new JButton("Truck");
        this.sedan = new JButton("Sedan");
        this.blue = new JButton("Blue");
        this.red = new JButton("Red");
        this.grey = new JButton("Grey");
        this.highTint = new JButton("High Tint");
        this.exit = new JButton("Exit");
        this.setLayout(new BoxLayout(this, Y_AXIS));
        this.add(this.lookup);
        this.add(this.blue);
        this.add(this.red);
        this.add(this.grey);
        this.add(this.highTint);

        this.add(this.clear);
//        this.add(this.submit);
        this.add(this.exit);

        // instantiate the controller
        this.controller = controller;
        this.lookup.addActionListener(this.controller);//adds action listener
        this.repaint();
        this.submit.addActionListener(this.controller);
        this.repaint();

        this.clear.addActionListener(this.controller);
        this.repaint();

        this.truck.addActionListener(this.controller);
        this.repaint();

        this.sedan.addActionListener(this.controller);
        this.repaint();

        this.blue.addActionListener(this.controller);
        this.repaint();

        this.red.addActionListener(this.controller);
        this.repaint();

        this.grey.addActionListener(this.controller);
        this.repaint();

        this.highTint.addActionListener(this.controller);
        this.repaint();

        this.exit.addActionListener(this.controller);
        this.repaint();

        this.setBackground(Color.CYAN);
        this.repaint();

    }
//
//    public void swtichCarImage() {
//        this.mainWindow.switchCarImage();
//    }
//
//    public void blueCarImage() {
//        this.mainWindow.blueCars();
//    }
//
//    public void greyCarImage() {
//        this.mainWindow.greyCars();
//    }
//
//    public void redCarImage() {
//        this.mainWindow.redCars();
//    }
//    public void redTintImage(){
//        this.mainWindow.r
//    }
//    public void blueTintImage(){
//        this.mainWindow.
//    }
//    public void greyTintImage(){
//        this.mainWindow.tintRedCars();
//    }
}
