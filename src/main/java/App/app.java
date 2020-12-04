/**
	File name: app.java
	Short description: FILL THIS IN
	IST 242 Assignment:  Enter Assignment # here
	@author Kyle Guldin
	@version 1.01 2014-08-25
	Date: 
*/

package App;

/**
*
*@author Kyle Guldin
import java.util.Scanner;
**/


import Model.Car;
import View.OpeningWindow;
import java.util.Observer;


public class app {
    public static void main(String[] args) {
        System.out.println("Kyle's Car Customs");
        OpeningWindow mainWindow = new OpeningWindow();
        Car vehicle = new Car();
        vehicle.addObserver(mainWindow);
    }
}

