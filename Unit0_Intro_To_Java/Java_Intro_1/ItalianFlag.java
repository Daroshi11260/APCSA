// Roshan Taneja
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.Font;

public class ItalianFlag extends GraphicsProgram
{

    public void run()
    {
        GRect greenThird = new GRect(20, 20, 40, 60);
        greenThird.setFilled(true);
        greenThird.setColor(Color.green);
        add(greenThird);
  
        GRect redThird = new GRect(100, 20, 40, 60);
        redThird.setFilled(true);
        redThird.setColor(Color.red);
        add(redThird);
         
        // this draws a nice black border around the flag
        // notice how I did NOT make it filled, and it is black by default
        GRect border = new GRect(20, 20, 120, 60);        
        add(border);
        
        GLabel italia = new GLabel("Viva Italia!", 20, 120);       
        // The .setFont method is a bit tricky: You could also write
        // italia.setFont("Times-Bold-36"); 
        // Stick to basic font faces, capitalization matters, and don't use 
        // any spaces.
        italia.setFont("Arial-Plain-24");
        add(italia);
        
        
    
    }


}
