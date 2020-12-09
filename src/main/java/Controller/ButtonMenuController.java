/**
 * File name: ButtonMenuController.java
 * Short description: FILL THIS IN
 * IST 242 Assignment:  Enter Assignment # here
 *
 * @author Kyle Guldin
 * @version 1.01 2014-08-25 Date:
 */
package Controller;

/**
 *
 * @author Kyle Guldin import java.util.Scanner;
*
 */
import View.ButtonMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMenuController implements ActionListener {

    ButtonMenu view;

    public ButtonMenuController(ButtonMenu view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Switch Car")) {
            System.out.println("Switch");
            this.view.swtichCarImage();
        } else if (e.getActionCommand().equals("Blue")) {
            System.out.println("Blue");
            this.view.blueCarImage();
        } else if (e.getActionCommand().equals("Grey")) {
            System.out.println("Grey");
            this.view.greyCarImage();
        } else if (e.getActionCommand().equals("Red")) {
            System.out.println("Red");
            this.view.redCarImage();
        }

    }
}
