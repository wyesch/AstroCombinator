import java.awt.*;


public class ImageImpl implements IImage{
    private int[] size;
    public ImageImpl(int width, int height){
        size = new int[2];
        size[0] = width;
        size[1] = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        if(x>=0&&x<getWidth()&&y>=0&&y<getHeight()) {
            Color red = new Color(0xFF0000);
            return red;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int getWidth() {
        return size[0];
    }
    @Override
    public int getHeight(){
        return size[1];
    }
}
