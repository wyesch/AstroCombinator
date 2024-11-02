import java.awt.*;

public interface Image {
    //* returns pixel color at x and y
    Color getPixelColor(int x,int y);
    //* returns array getsize[0] = width getsize[1] = height
    int[] getSize();
}
