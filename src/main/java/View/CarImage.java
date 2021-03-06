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

    JPanel panel;
    ImageIcon carImage = new ImageIcon(getClass().getResource("/images/DefaultCars.PNG"));
    JLabel carLabel = new JLabel(carImage);
    ImageIcon defaultImage = new ImageIcon(getClass().getResource("/images/DefaultCars.PNG"));
    JLabel defaultLabel = new JLabel(defaultImage);

    public CarImage() {
        this.panel = new JPanel();
        this.add(this.defaultLabel); //adds defaul label
        this.add(this.carLabel);//adds car label

        this.defaultLabel.setVisible(true); //sets default label to visible

        this.repaint();

        this.setBackground(Color.DARK_GRAY);
    }

    public void setCarImage(String type, String color, boolean high_tint) {
        String imageName;
        this.add(this.defaultLabel);//adds default label
        this.defaultLabel.setVisible(true);// ensures default label is visible
        if (high_tint == true) {
            imageName = "/images/" + type + color + "withtint.PNG";//gets the correct image based on decisions

            this.repaint();
        } else {
            imageName = "/images/" + type + color + ".PNG";
            this.repaint();

        }
        this.carLabel.setVisible(false);//sets labels to not visible
        // i changed it from remove, because i think that was where the source of it not updating was from
        this.defaultLabel.setVisible(false);
        System.out.println("load: " + imageName);
        ImageIcon carimage = new ImageIcon(getClass().getResource(imageName));
        this.repaint();
        this.validate();//i put repaint and validate in a bunch just to make sure it would actually change
        this.repaint();//because at first it was not
        this.carLabel = new JLabel(carimage);
        this.panel.add(this.carLabel);//adding the new carlabel back with the updated image
        this.repaint();
        this.add(this.carLabel);//this is repetitive but i didnt want to mess with it because i didnt want it to break
        this.repaint();

    }
}

//    ImageIcon sedanImage = new ImageIcon(getClass().getResource("/images/IST261SedanOutline.PNG"));
//    JLabel sedanLabel = new JLabel(sedanImage);
//    ImageIcon truckImage = new ImageIcon(getClass().getResource("/images/IST261TruckOutline.PNG"));
//    JLabel truckLabel = new JLabel(truckImage);
//    boolean carImage = true;
//    boolean blue = true;
//    boolean grey = true;
//    boolean red = true;
//    boolean highTint= true;
//    ImageIcon blueSedan = new ImageIcon(getClass().getResource("/images/sedanblue.PNG"));
//    JLabel blueSedanImage = new JLabel(blueSedan);
//    ImageIcon blueTruck = new ImageIcon(getClass().getResource("/images/truckblue.PNG"));
//    JLabel blueTruckImage = new JLabel(blueTruck);
//    ImageIcon greySedan = new ImageIcon(getClass().getResource("/images/sedangray.PNG"));
//    JLabel greySedanImage = new JLabel(greySedan);
//    ImageIcon greyTruck = new ImageIcon(getClass().getResource("/images/truckgray.PNG"));
//    JLabel greyTruckImage = new JLabel(greyTruck);
//    ImageIcon redTruck = new ImageIcon(getClass().getResource("/images/truckred.PNG"));
//    JLabel redTruckImage = new JLabel(redTruck);
//    ImageIcon redSedan = new ImageIcon(getClass().getResource("/images/sedanred.PNG"));
//    JLabel redSedanImage = new JLabel(redSedan);
//ImageIcon redTintSedan = new ImageIcon(getClass().getResource("/images/sedanredwithtint.PNG"));
//    JLabel redTintSedanImage = new JLabel(redTintSedan);
//    ImageIcon redTintTruck = new ImageIcon(getClass().getResource("/images/truckredwithtint.PNG"));
//    JLabel redTintTruckImage = new JLabel(redTintTruck);
//    ImageIcon greyTintSedan = new ImageIcon(getClass().getResource("/images/sedangraywithtint.PNG"));
//    JLabel greyTintSedanImage = new JLabel(greyTintSedan);
//    ImageIcon greyTintTruck = new ImageIcon(getClass().getResource("/images/truckgraywithtint.PNG"));
//    JLabel greyTintTruckImage = new JLabel(greyTintTruck);
//    ImageIcon blueTintSedan = new ImageIcon(getClass().getResource("/images/sedanbluewithtint.PNG"));
//    JLabel blueTintSedanImage = new JLabel(blueTintSedan);
//    ImageIcon blueTintTruck = new ImageIcon(getClass().getResource("/images/truckbluewithtint.PNG"));
//    JLabel blueTintTruckImage = new JLabel(blueTintTruck);
//    public void switchCarImage() {
//        if (this.carImage == true) {
//            this.repaint();
//            this.remove(this.SedanLabel);
//            this.remove(this.blueSedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.repaint();
//            this.add(this.truckLabel);
//            this.truckLabel.repaint();
//        } else {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.repaint();
//            this.add(this.SedanLabel);
//            this.SedanLabel.repaint();
//        }
//        this.repaint();
//        this.carImage = !this.carImage;
//    }
//
//    public void blueCarImage() {
//        if (this.blue == true && this.carImage == true) {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.repaint();
//            this.add(this.blueSedanImage);
//        } else {
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.blueTruckImage);
//        }
//        this.repaint();
//    }
//
//    public void greyCarImage() {
//        if (this.grey == true && this.carImage == true) {
//            this.repaint();
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.greySedanImage);
//        } else {
//            this.remove(this.redSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.greyTruckImage);
//        }
//        this.repaint();
//    }
//
//    public void redCarImage() {
//        if (this.red == true && this.carImage == true) {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.redSedanImage);
//        } else {
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.redTruckImage);
//        }
//        this.repaint();
//    }
//    public void redTintCarImage() {
//        if (this.red == true && this.carImage == true && this.highTint == true) {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintTruckImage);
//            this.remove(this.redSedanImage);
//            this.add(this.redTintSedanImage);
//            this.repaint();
//        } else {
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redSedanImage);
//            this.add(this.redTintTruckImage);
//            this.repaint();
//        }
//        this.repaint();
//    }
//    public void blueTintCarImage() {
//        if (this.blue == true && this.carImage == true && this.highTint == true) {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//             this.add(this.blueTintSedanImage);
//             this.repaint();
//        } else {
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.blueTintTruckImage);
//            this.repaint();
//        }
//        this.repaint();
//    }
//    public void greyTintCarImage() {
//        if (this.grey == true && this.carImage == true && this.highTint == true) {
//            this.repaint();
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintTruckImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.greyTintSedanImage);
//        } else {
//            this.remove(this.truckLabel);
//            this.remove(this.SedanLabel);
//            this.remove(this.greyTruckImage);
//            this.remove(this.greySedanImage);
//            this.remove(this.blueTruckImage);
//            this.remove(this.blueSedanImage);
//            this.remove(this.redTruckImage);
//            this.remove(this.redSedanImage);
//            this.remove(this.blueTintTruckImage);
//            this.remove(this.blueTintSedanImage);
//            this.remove(this.greyTintSedanImage);
//            this.remove(this.redTintSedanImage);
//            this.remove(this.redTintTruckImage);
//            this.add(this.greyTintTruckImage);
//        }
//        this.repaint();
//    }
//    public void highTint(String carType, String carColor) {
//        if (carType == "sedan") {
//            
//        } else {
//            
//        }
//    }
