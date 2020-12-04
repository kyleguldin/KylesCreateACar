/**
	File name: CarImage.java
	Short description: FILL THIS IN
	IST 242 Assignment:  Enter Assignment # here
	@author Kyle Guldin
	@version 1.01 2014-08-25
	Date: 
*/

package View;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
*
*@author Kyle Guldin
import java.util.Scanner;
**/

public class CarImage extends JPanel {
    ImageIcon sedanImage = new ImageIcon(getClass().getResource("images/IST261SedanOutline.PNG"));
    JLabel SedanLabel = new JLabel(sedanImage);
    ImageIcon truckImage = new ImageIcon(getClass().getResource("images/IST261TruckOutline.PNG"));
    JLabel truckLabel = new JLabel(truckImage);
    boolean carImage = true;
    
    public CarImage() {
        
        this.add(this.SedanLabel);
        this.add(this.truckLabel);
        this.setBackground(Color.DARK_GRAY);
    }
    
    public void switchCarImage() {
        if (this.carImage == true) {
            this.remove(this.SedanLabel);
            this.add(this.truckLabel);
            this.truckLabel.repaint();
        } else {
            this.remove(this.truckLabel);
            this.add(this.SedanLabel);
            this.SedanLabel.repaint();
        }
        this.repaint();
        this.carImage = !this.carImage;
    }
}
