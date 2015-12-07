
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
        
        if (image.getWidth()%2 == 0){
        for( int i = 0, k = image.getWidth()-1; i < k; i++, k--) {
	            for (int j = 0 ,l = 0; j < image.getHeight() ;j++, l++) {
	                
	                int y = image.getPixel(k, l);
	                int x = image.getPixel(i j);
	                image.setPixel(i, j, y);
	                image.setPixel(k, l, x);
	               }
	           }
        	           }
    
}
