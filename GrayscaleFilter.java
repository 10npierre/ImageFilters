import java.awt.Color;
/**
 * Write a description of class GrayscaleFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrayscaleFilter extends Filter
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class GrayscaleFilter
     */
    public GrayscaleFilter(String name)
    {
        
        super(name);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void apply(OFImage image)
    {
        // put your code here
        int height = image.getHeight();
        int width = image.getWidth();
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
               int pixel = image.getRGB(x, y);               
               int green = (pixel >> 8)&0xff;
               int alpha = (pixel >> 24)&0xff;
               int blue = pixel&0xff;
               int red = (pixel >> 16)&0xff;
               int avgerage = (red + green + blue)/3;
               pixel = (alpha << 24) | (avgerage << 16) | (avgerage << 8) | avgerage;
               image.setRGB(x, y, pixel);
            }
        }
    }
}
