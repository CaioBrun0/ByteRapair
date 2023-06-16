package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAtendentePag;

    @FXML
    private Button btnGerentePag;

    @FXML
    private Button btnTecnicoPag;

    @FXML
    void btnAtendentePagAction(ActionEvent event) {


    }

    @FXML
    void btnGerentePagAction(ActionEvent event) {

    }

    @FXML
    void btnTecnicoPagAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAtendentePag != null : "fx:id=\"btnAtendentePag\" was not injected: check your FXML file 'Main.fxml'.";
        assert btnGerentePag != null : "fx:id=\"btnGerentePag\" was not injected: check your FXML file 'Main.fxml'.";
        assert btnTecnicoPag != null : "fx:id=\"btnTecnicoPag\" was not injected: check your FXML file 'Main.fxml'.";

    }

}
