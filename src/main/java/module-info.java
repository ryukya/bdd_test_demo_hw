module com.example.bdd_test_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bdd_test_demo to javafx.fxml;
    exports com.example.bdd_test_demo;
}