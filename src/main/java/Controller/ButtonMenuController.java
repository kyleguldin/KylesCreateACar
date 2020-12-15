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
import Model.Car;
import View.ButtonMenu;
import View.CarImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMenuController implements ActionListener {

//    ButtonMenu buttonView;
    CarImage carView;
    Car currentCar;

    public ButtonMenuController(CarImage carView) {
        this.carView = carView;
        this.currentCar = new Car();
        this.currentCar.setType("sedan");
        this.currentCar.setColor("red");
        this.currentCar.setHighTint(false);
        this.carView.setCarImage( this.currentCar.getType(),
                this.currentCar.getColor(),
                this.currentCar.getHighTint() );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Switch Car")) {
            if ( this.currentCar.getType() == "truck" ) {
                this.currentCar.setType("sedan");
            } else {
                this.currentCar.setType("truck");
            }
        } else if (e.getActionCommand().equals("Blue")) {
            this.currentCar.setColor("blue");
        } else if (e.getActionCommand().equals("Grey")) {
            this.currentCar.setColor("grey");
        } else if (e.getActionCommand().equals("Red")) {
            this.currentCar.setColor("red");
        } else if (e.getActionCommand().equals("High Tint")) {
            this.currentCar.setHighTint(true);
        }
        
        this.carView.setCarImage( this.currentCar.getType(),
                this.currentCar.getColor(),
                this.currentCar.getHighTint() );
    }
}
