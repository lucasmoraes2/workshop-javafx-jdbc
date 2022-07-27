module com.lucasmoraes2.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lucasmoraes2.workshopjavafxjdbc to javafx.fxml;
    exports com.lucasmoraes2.workshopjavafxjdbc;
    exports;
    opens to
}