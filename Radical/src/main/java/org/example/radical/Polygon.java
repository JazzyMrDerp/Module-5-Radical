package org.example.radical;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class Polygon extends Application {
    public void start(Stage stage) throws IOException {
        //Creating a Polygon
        Polygon polygon = new Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(List.of(new Double[]{
                490.0, 50.0,
                750.0, 50.0,
                890.0, 277.0,
                754.0, 500.0,
                490.0, 500.0,
                370.0, 277.0,
        }));
//Creating a Group object
        Group root = new Group((Collection<Node>) polygon);
//Creating a scene object
        Scene scene = new Scene(root, 1208, 581);
//Setting title to the Stage
        stage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        stage.setScene(scene);
//Displaying the contents of the stage
        stage.show();

    }

    <E> Collection getPoints() {
        return null;
    }

    public static void main(String[] args) {
        launch();
    }
}

