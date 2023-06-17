package app.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
        Main main = new Main();
        main.trocarTela("atendente");

    }

    @FXML
    void btnGerentePagAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("gerente");
    }

    @FXML
    void btnTecnicoPagAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("tecnico");


    }

    @FXML
    void initialize() {
        assert btnAtendentePag != null : "fx:id=\"btnAtendentePag\" was not injected: check your FXML file 'app.Main.fxml'.";
        assert btnGerentePag != null : "fx:id=\"btnGerentePag\" was not injected: check your FXML file 'app.Main.fxml'.";
        assert btnTecnicoPag != null : "fx:id=\"btnTecnicoPag\" was not injected: check your FXML file 'app.Main.fxml'.";

    }

}
