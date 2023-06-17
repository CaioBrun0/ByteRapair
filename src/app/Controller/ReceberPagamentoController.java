package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

import static java.awt.SystemColor.menu;

public class ReceberPagamentoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem btnCCredito;

    @FXML
    private MenuItem btnCDebito;

    @FXML
    private MenuItem btnCash;

    @FXML
    private MenuItem btnPIX;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelError;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    void btnCCreditoAction(ActionEvent event) {
        AttendantDAOImp pagamento = new AttendantDAOImp();
        pagamento.rPayment(this.txtCPFCliente.getText(), 1);

        this.txtCPFCliente.clear();

    }

    @FXML
    void btnCDebitoAction(ActionEvent event) {
        AttendantDAOImp pagamento = new AttendantDAOImp();
        pagamento.rPayment(this.txtCPFCliente.getText(), 2);

        this.txtCPFCliente.clear();

    }

    @FXML
    void btnCashAction(ActionEvent event) {
        AttendantDAOImp pagamento = new AttendantDAOImp();
        pagamento.rPayment(this.txtCPFCliente.getText(), 4);

        this.txtCPFCliente.clear();

    }

    @FXML
    void btnPIXAction(ActionEvent event) {
        AttendantDAOImp pagamento = new AttendantDAOImp();
        pagamento.rPayment(this.txtCPFCliente.getText(), 3);

        this.txtCPFCliente.clear();
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("main");

    }

    @FXML
    void initialize() {
        assert btnCCredito != null : "fx:id=\"btnCCredito\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert btnCDebito != null : "fx:id=\"btnCDebito\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert btnCash != null : "fx:id=\"btnCash\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert btnPIX != null : "fx:id=\"btnPIX\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";
        assert txtCPFCliente != null : "fx:id=\"txtCPFCliente\" was not injected: check your FXML file 'ReceberPagamento.fxml'.";

    }

}
