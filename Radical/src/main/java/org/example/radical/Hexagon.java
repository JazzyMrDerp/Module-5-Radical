package org.example.radical;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Hexagon extends Application {
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        stage.setTitle("QuadCurve Example");
        QuadCurve c = new QuadCurve();
        c.setStartX(70);
        c.setStartY(30);
        c.setControlX(250);
        c.setControlY(50);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(250);
        c.setEndY(300);
        root.getChildren().add(c);
        Scene scene = new Scene(root,300,400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
