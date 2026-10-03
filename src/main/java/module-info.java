module com.example.provajavaiiluizmiguel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provajavaiiluizmiguel to javafx.fxml;
    exports com.example.provajavaiiluizmiguel;
}