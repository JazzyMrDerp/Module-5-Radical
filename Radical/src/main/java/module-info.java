module org.example.radical {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.radical to javafx.fxml;
    exports org.example.radical;
}