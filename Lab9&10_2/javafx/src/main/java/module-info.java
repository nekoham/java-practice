module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.Lab9 to javafx.fxml;
    opens com.Lab10_2 to javafx.fxml;

    exports com.Lab9;
    exports com.Lab10_2;
}
