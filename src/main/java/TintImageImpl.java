import java.awt.*

public class TintImageImpl implements ITintImage {
    private Color[][] pixels;
    private TintColor tint;

    public RedImage(TintColor tint, IImage grayImage) {
        if (tint == null) {
            throw new IllegalArgumentException("Tint may not be null");
        }
        if (grayImage == null) {
            throw new IllegalArgumentException("grayImage may not be null");
        }
        this.tint = tint;
        pixels = new Color[grayImage.getHeight()][grayImage.getWidth()];
        for (int y = 0; y < grayImage.getHeight(); y++) {
            for (int x = 0; x < grayImage.getWidth(); x++) {
                Color grayColor = grayImage.getPixelAt(x, y);
                switch (tint) {
                    case RED:
                        pixels[y][x] = new Color(grayColor.getRed(), 0, 0);
                        break;
                    case GREEN:
                        pixels[y][x] = new Color(0, grayColor.getGreen(), 0);
                        break;
                    case BLUE:
                        pixels[y][x] = new Color(0, 0, grayColor.getBlue());
                        break;
                }
            }
        }
    }

    public Color getPixelAt(int x, int y) {
        return pixels[y][x];
    }
    
    public TintColor getTintColor() {
        return tint;
    }

    public getWidth() {
        return pixels[0].length;
    }

    public getHeight() {
        return pixels.length;
    }
}
