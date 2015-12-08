import java.awt.image.BufferedImage;
/**
 * Write a description of class MirrorFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MirrorFilter extends Filter
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MirrorFilter
     */
    public MirrorFilter(String name)
    {
        // initialise instance variables
        super(name);
    }

    /**
     * A method that will mirror the original image
     * 
     * @param  image 
     * 
     */
    public void apply(OFImage image)
    {
        // put your code here
        int height = image.getHeight();
        int width = image.getWidth();
         
        
        for(int y = 0; y < height; y++) {
            for(int lx = 0, rx = width - 1; lx < width; lx++, rx--) {         
                 
               int pixel = image.getRGB(lx, y);
               image.setRGB(lx, y, pixel);
               image.setRGB(rx, y, pixel);
               
            }
           }
    }
    
}
