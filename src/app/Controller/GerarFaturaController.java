package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.TechnicianDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GerarFaturaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGerarFatura;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelError;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    void btnGerarFaturaAction(ActionEvent event) {
        TechnicianDAOImp fatura = new TechnicianDAOImp();
        fatura.finishService(this.txtCPFCliente.getText(), this.txtNomeCliente.getText());

        this.txtCPFCliente.clear();
        this.txtNomeCliente.clear();
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("tecnico");

    }

    @FXML
    void initialize() {
        assert btnGerarFatura != null : "fx:id=\"btnGerarFatura\" was not injected: check your FXML file 'GerarFatura.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'GerarFatura.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'GerarFatura.fxml'.";
        assert txtCPFCliente != null : "fx:id=\"txtCPFCliente\" was not injected: check your FXML file 'GerarFatura.fxml'.";
        assert txtNomeCliente != null : "fx:id=\"txtNomeCliente\" was not injected: check your FXML file 'GerarFatura.fxml'.";

    }

}

