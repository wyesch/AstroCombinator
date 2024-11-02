import javafx.application.Application;

import java.awt.*;
import java.util.Scanner;

public class main {
    public static IImage make(){
        IImage Red = new ImageImpl(10,10);
        return Red;
    }
    public static void main(String[] args){
        Application.launch(ImageDisplay.class,args);
    }
}
