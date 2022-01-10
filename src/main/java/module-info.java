module es.dylanhurtado.contactosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.dylanhurtado.contactosfx to javafx.fxml;
    exports es.dylanhurtado.contactosfx;
}