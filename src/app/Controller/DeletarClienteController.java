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

public class DeletarClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelError;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    void btnExcluirAction(ActionEvent event) {
        AttendantDAOImp excluirCliente = new AttendantDAOImp();
        excluirCliente.callDClient(this.txtCPFCliente.getText());

        this.txtCPFCliente.clear();
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cliente");

    }

    @FXML
    void initialize() {
        assert btnExcluir != null : "fx:id=\"btnExcluir\" was not injected: check your FXML file 'DeletarCliente.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'DeletarCliente.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'DeletarCliente.fxml'.";
        assert txtCPFCliente != null : "fx:id=\"txtCPFCliente\" was not injected: check your FXML file 'DeletarCliente.fxml'.";

    }

}
