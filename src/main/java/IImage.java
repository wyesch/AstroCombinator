import java.awt.*;


public interface IImage {
    //* returns pixel color at x and y
    Color getPixelColor(int x,int y);
    //* returns array getSize[0] = width, getSize[1] = height
    int getWidth();
    int getHeight();
}
