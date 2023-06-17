package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CancelarOSController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCencelarPedido;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelError;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    void btnCancelarPedidoAction(ActionEvent event) {
        AttendantDAOImp cancelar = new AttendantDAOImp();
        cancelar.callDOS(this.txtCPFCliente.getText());
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("OS");

    }

    @FXML
    void initialize() {
        assert btnCencelarPedido != null : "fx:id=\"btnCencelarPedido\" was not injected: check your FXML file 'CancelarOS.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'CancelarOS.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'CancelarOS.fxml'.";
        assert txtCPFCliente != null : "fx:id=\"txtCPFCliente\" was not injected: check your FXML file 'CancelarOS.fxml'.";

    }

}
