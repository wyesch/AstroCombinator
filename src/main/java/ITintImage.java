import java.awt.*

public interface ITintImage extends IImage {
    enum TintColor {
        RED,
        GREEN,
        BLUE,
    }

    TintColor getTintColor();
}
