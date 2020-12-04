/**
	File name: OpeningWindow.java
	Short description: FILL THIS IN
	IST 242 Assignment:  Enter Assignment # here
	@author Kyle Guldin
	@version 1.01 2014-08-25
	Date: 
*/

package View;



/**
*
*@author Kyle Guldin
import java.util.Scanner;
**/


import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author kqy1
 */
public class OpeningWindow extends JFrame implements Observer{
    
    ButtonMenu buttonMenu;
    CarImage carImage = new CarImage();
    FeatureOptions detailOptions = new FeatureOptions();
    
    public OpeningWindow() {
        
        this.buttonMenu = new ButtonMenu( this );
        
        this.setLayout( new BorderLayout() );
        this.add( this.buttonMenu, BorderLayout.EAST);
        this.add( this.detailOptions, BorderLayout.SOUTH);
        this.add( this.carImage, BorderLayout.CENTER);
        
        this.setTitle("Kyle's Car Detail");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize( 50, 50);
        this.setVisible(true);
    }
    
    public void switchCarImage() {
        this.carImage.switchCarImage();
        this.carImage.revalidate();
    }

    @Override
    public void update(Observable o, Object arg) {
        // change UI to reflect that the model looks like now
    }
}