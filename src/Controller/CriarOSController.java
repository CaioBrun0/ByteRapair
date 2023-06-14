package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CriarOSController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCriarOS;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextArea txtDescrição;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtID;

    @FXML
    private TextArea txtPecas;

    @FXML
    private TextField txtStatus;

    @FXML
    void btnCriarOSAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCriarOS != null : "fx:id=\"btnCriarOS\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtCPF != null : "fx:id=\"txtCPF\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtDescrição != null : "fx:id=\"txtDescrição\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtHora != null : "fx:id=\"txtHora\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtID != null : "fx:id=\"txtID\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtPecas != null : "fx:id=\"txtPecas\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtStatus != null : "fx:id=\"txtStatus\" was not injected: check your FXML file 'CriarOS.fxml'.";


    }

}
