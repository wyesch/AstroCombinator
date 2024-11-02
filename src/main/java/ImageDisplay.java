import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ImageDisplay extends Application {
    public void start(Stage stage) throws IOException{
        Image image = (Image)main.make();

        ImageView imageView = new ImageView();

        imageView.setImage(image);

        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(575);
        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        Scene scene = new Scene(root,595,370);
        stage.setTitle("display image");
        stage.setScene(scene);
        stage.show();
    }
    //pulled from https://www.tutorialspoint.com/how-to-display-an-image-in-javafx
}
