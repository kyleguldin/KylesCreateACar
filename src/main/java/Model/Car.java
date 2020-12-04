package Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

public class Car extends Observable{
    private final Map<String, Double> colorCost;
    private final Map<String, Double> windowTintCost;
    String color;  // red, blue, gray
    String windowTint;  // high or low
    String type;    // car or truck

    public Car() {
        this.colorCost = new HashMap<>();
        this.colorCost.put("red", 500.00);
        this.colorCost.put("blue", 600.00);
        this.colorCost.put("gray", 800.00);
        
        this.windowTintCost = new HashMap<>();
        this.windowTintCost.put("high", 1100.0);
        this.windowTintCost.put("low", 900.0);
    }
    
    public Double totalCost() {
        Double body = this.colorCost.get( this.color );
        Double window = this.windowTintCost.get( this.windowTint);
        return body + window;
    }
    
    public void setColor(String c) {
        this.color = c;
        this.notifyAll();
    }
}