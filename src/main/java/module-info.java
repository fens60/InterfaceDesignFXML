module com.example.interfacedesignfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfacedesignfxml to javafx.fxml;
    exports com.example.interfacedesignfxml;
    exports es.ieslosmontecillos.di_t1a1_shanshangfeng;
    opens es.ieslosmontecillos.di_t1a1_shanshangfeng to javafx.fxml;
}