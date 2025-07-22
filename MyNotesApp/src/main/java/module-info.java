module com.nhq.mynotesapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens com.nhq.mynotesapp to javafx.fxml;
    exports com.nhq.mynotesapp;
    
}
