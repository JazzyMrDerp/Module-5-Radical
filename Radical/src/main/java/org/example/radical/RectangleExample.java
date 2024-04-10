package org.example.radical;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleExample extends Application {
    Parent root;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        int red=20;
        int green=125;
        int blue=10;
        rect.setFill(Color.rgb(red, green, blue,0.63));
        root.getChildrenUnmodifiable().add(rect);
        Scene scene = new Scene(root,200,200);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
