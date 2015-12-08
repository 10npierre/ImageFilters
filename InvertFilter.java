import java.awt.Color;
/**
 * Write a description of class InverFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvertFilter extends Filter
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class InverFilter
     */
    public InvertFilter(String name)
    {
        // initialise instance variables
       super(name);
    }

    /**
     * A Invert mathod to invert the colors of the picture
     * 
     * @param  image 
     *  
     */
    public void apply(OFImage image)
    {
        // put your code here
        int height = image.getHeight();
        int width = image.getWidth();
        
         for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                int picture = image.getRGB(x, y);
                Color color = new Color(picture, true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                image.setRGB(x, y, color.getRGB());
            }
        }
    }
}
