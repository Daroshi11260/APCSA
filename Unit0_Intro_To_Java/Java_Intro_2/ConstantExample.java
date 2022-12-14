import acm.program.*; 
import acm.graphics.*; 
import java.awt.Color;

public class ConstantExample extends GraphicsProgram 
{
    private static final double BOX_WIDTH = 70; 
    private static final double BOX_HEIGHT = 30; 
    private static final double WINDOW_WIDTH = 754; 
    private static final double WINDOW_HEIGHT = 492;

    public void run() 
    {
       GRect rect = new GRect(WINDOW_WIDTH/2 - BOX_WIDTH/2,
                              WINDOW_HEIGHT/2 - BOX_HEIGHT/2,
                              BOX_WIDTH, BOX_HEIGHT);
       rect.setFilled(true);
       rect.setColor(Color.red);
       add(rect);
       
       GOval oval = new GOval(WINDOW_WIDTH/2 - BOX_WIDTH/2,
                              WINDOW_HEIGHT/2 - BOX_HEIGHT/2,
                              BOX_WIDTH, BOX_HEIGHT);
       oval.setFilled(true);
       oval.setColor(Color.green);
       add(oval);
    }
}
