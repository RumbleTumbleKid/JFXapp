package org.yourcompany.yourproject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Jfx extends Application {

    @Override
    public void start(Stage stage) {
        var vbox = new VBox(new Label("Hello"));
        vbox.setAlignment(Pos.CENTER);
        var scene = new Scene(vbox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
  
}
