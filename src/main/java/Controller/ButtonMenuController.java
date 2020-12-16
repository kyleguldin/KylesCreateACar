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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ButtonMenuController implements ActionListener {

//    ButtonMenu buttonView;
    CarImage carView;
    Car currentCar;

    public ButtonMenuController(CarImage carView) {
        this.carView = carView;
        this.currentCar = new Car();
        this.currentCar.setType("Default");//setting current car type as default
        this.currentCar.setColor("Cars");//setting cars to the default cars image
        this.currentCar.setHighTint(false);//making sure tint is false initially
        this.carView.setCarImage(this.currentCar.getType(),
                this.currentCar.getColor(),
                this.currentCar.getHighTint());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Switch Car")) {
            if (this.currentCar.getType() == "truck") {
                this.currentCar.setType("sedan");

            } else if (this.currentCar.getType() == "Default") {//if the current car is the default picture and a user clicks 
                this.currentCar.setType("sedan");//switch car, the car will be default at a blue sedan, where they can then 
                this.currentCar.setColor("blue");//everything else
            } else {
                this.currentCar.setType("truck");//if the current car is not default or truck than the sedan will be switched to

            }
        } else if (e.getActionCommand().equals("Blue")) {//if the button command is blue it sets the color to blue
            this.currentCar.setColor("blue");
        } else if (e.getActionCommand().equals("Grey")) {//if the button command is grey it sets the color to grey
            this.currentCar.setColor("grey");
        } else if (e.getActionCommand().equals("Red")) {//if the button command is Red it sets the color to Red
            this.currentCar.setColor("red");
        } else if (e.getActionCommand().equals("High Tint")) {//if high tint is clicked the boolean variable High_Tint= true
            this.currentCar.setHighTint(true);
        } else if (e.getActionCommand().equals("clear")) {//sets car back to default 
            this.currentCar.setType("Default");
            this.currentCar.setColor("Cars");
            this.currentCar.setHighTint(false);
        } else if (e.getActionCommand().equals("Exit")) {//exits if exit is clicked
            System.exit(0);
        }

        this.carView.setCarImage(this.currentCar.getType(),
                this.currentCar.getColor(),
                this.currentCar.getHighTint());

    }
}
