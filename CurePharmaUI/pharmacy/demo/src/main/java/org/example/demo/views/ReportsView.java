package org.example.demo.views;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ReportsView {
    public Parent getView() {
        VBox box = new VBox(new Label("Reports View"));
        box.setStyle("-fx-padding: 20;");
        return box;
    }
}
