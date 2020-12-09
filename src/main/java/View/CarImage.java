/**
 * File name: CarImage.java
 * Short description: FILL THIS IN
 * IST 242 Assignment:  Enter Assignment # here
 *
 * @author Kyle Guldin
 * @version 1.01 2014-08-25 Date:
 */
package View;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kyle Guldin import java.util.Scanner;
 *
 */
public class CarImage extends JPanel {

    ImageIcon sedanImage = new ImageIcon(getClass().getResource("/images/IST261SedanOutline.PNG"));
    JLabel SedanLabel = new JLabel(sedanImage);
    ImageIcon truckImage = new ImageIcon(getClass().getResource("/images/IST261TruckOutline.PNG"));
    JLabel truckLabel = new JLabel(truckImage);
    boolean carImage = true;
    boolean blue = true;
    boolean grey = true;
    boolean red = true;
    ImageIcon blueSedan = new ImageIcon(getClass().getResource("/images/sedanblue.PNG"));
    JLabel blueSedanImage = new JLabel(blueSedan);
    ImageIcon blueTruck = new ImageIcon(getClass().getResource("/images/truckblue.PNG"));
    JLabel blueTruckImage = new JLabel(blueTruck);
    ImageIcon greySedan = new ImageIcon(getClass().getResource("/images/sedangray.PNG"));
    JLabel greySedanImage = new JLabel(greySedan);
    ImageIcon greyTruck = new ImageIcon(getClass().getResource("/images/truckgray.PNG"));
    JLabel greyTruckImage = new JLabel(greyTruck);
    ImageIcon redTruck = new ImageIcon(getClass().getResource("/images/truckred.PNG"));
    JLabel redTruckImage = new JLabel(redTruck);
    ImageIcon redSedan = new ImageIcon(getClass().getResource("/images/sedanred.PNG"));
    JLabel redSedanImage = new JLabel(redSedan);

    public CarImage() {

        this.add(this.SedanLabel);
        this.add(this.truckLabel);
        this.setBackground(Color.DARK_GRAY);
    }

    public void switchCarImage() {
        if (this.carImage == true) {
            this.repaint();
            this.remove(this.SedanLabel);
            this.remove(this.blueSedanImage);
            this.remove(this.blueTruckImage);
            this.remove(this.greySedanImage);
            this.remove(this.greyTruckImage);
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.repaint();
            this.add(this.truckLabel);
            this.truckLabel.repaint();
        } else {
            this.repaint();
            this.remove(this.truckLabel);
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.remove(this.blueSedanImage);
            this.remove(this.blueTruckImage);
            this.remove(this.greyTruckImage);
            this.remove(this.greyTruckImage);
            this.repaint();
            this.add(this.SedanLabel);
            this.SedanLabel.repaint();
        }
        this.repaint();
        this.carImage = !this.carImage;
    }

    public void blueCarImage() {
        if (this.blue == true && this.carImage == true) {
            this.repaint();
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.greyTruckImage);
            this.remove(this.greySedanImage);
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.add(this.blueSedanImage);
        } else {
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.greyTruckImage);
            this.remove(this.greySedanImage);
            this.add(this.blueTruckImage);
        }
        this.repaint();
    }

    public void greyCarImage() {
        if (this.grey == true && this.carImage == true) {
            this.repaint();
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.blueTruckImage);
            this.remove(this.blueSedanImage);
            this.add(this.greySedanImage);
        } else {
            this.remove(this.redSedanImage);
            this.remove(this.redTruckImage);
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.blueTruckImage);
            this.remove(this.blueSedanImage);
            this.add(this.greyTruckImage);
        }
        this.repaint();
    }

    public void redCarImage() {
        if (this.red == true && this.carImage == true) {
            this.repaint();
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.blueTruckImage);
            this.remove(this.blueSedanImage);
            this.remove(this.greyTruckImage);
            this.remove(this.greySedanImage);
            this.add(this.redSedanImage);
        } else {
            this.remove(this.truckLabel);
            this.remove(this.SedanLabel);
            this.remove(this.greyTruckImage);
            this.remove(this.greySedanImage);
            this.remove(this.blueTruckImage);
            this.remove(this.blueSedanImage);
            this.add(this.redTruckImage);
        }
        this.repaint();
    }
}
