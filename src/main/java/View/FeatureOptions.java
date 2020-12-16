/**
 * File name: FeatureOptions.java
 * Short description: FILL THIS IN
 * IST 242 Assignment:  Enter Assignment # here
 *
 * @author Kyle Guldin
 * @version 1.01 2014-08-25 Date:
 */
package View;

/**
 *
 * @author Kyle Guldin import java.util.Scanner;
 *
 */
import Model.Car;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FeatureOptions extends JPanel {

    Car carDollars;

    public FeatureOptions() {
        this.carDollars = new Car();
        this.setBackground(Color.WHITE);
        this.setSize(2500, 2500);
        JLabel cost = new JLabel("Cost: " + carDollars);// this was supposed to display the cost from the hashmap but
        JLabel intro = new JLabel("Welcome to Kyle's Car customization! To begin click the "//tutorial/intro
                + "buttons on the right\n" + " You can perform various changes to the given "
                + "car of your choice!");
        this.add(intro);
        this.add(cost);
        intro.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
    }
}
