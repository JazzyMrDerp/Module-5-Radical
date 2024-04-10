package org.example.radical;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleRed extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        stage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        rect.setFill(Color.RED); //passing color name
        rect.setEffect(new DropShadow());
        root.getChildren().add(rect);
        Scene scene = new Scene(root,200,200);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}