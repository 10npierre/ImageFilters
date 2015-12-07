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
               int p = image.getRGB(x, y);
               int a = (p>>24)&0xff;
               int r = (p>>16)&0xff;
               int g = (p>>8)&0xff;
               int b = p&0xff;
               int avg = (r+g+b)/3;
               p = (a<<24) | (avg<<16) | (avg<<8) | avg;
               image.setRGB(x, y, p);
            }
        }
    }
}
