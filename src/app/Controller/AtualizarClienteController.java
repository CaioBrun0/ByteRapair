package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class AtualizarClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem address;

    @FXML
    private MenuButton btnMenuAtualização;

    @FXML
    private Button btnVoltar;

    @FXML
    private MenuItem email;

    @FXML
    private Label labelError;

    @FXML
    private MenuItem nPhone;

    @FXML
    private MenuItem name;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    private TextField txtNovoDado;

    @FXML
    void btnEmailAction(ActionEvent event) {
        AttendantDAOImp newEmail = new AttendantDAOImp();
        newEmail.callUClient(this.txtCPFCliente.getText(), this.email.getText(), this.txtNovoDado.getText());

        this.txtCPFCliente.clear();
        this.txtNovoDado.clear();
    }

    @FXML
    void btnEnderecoAction(ActionEvent event) {
        AttendantDAOImp newEmail = new AttendantDAOImp();
        newEmail.callUClient(this.txtCPFCliente.getText(), this.address.getText(), this.txtNovoDado.getText());

        this.txtCPFCliente.clear();
        this.txtNovoDado.clear();
    }

    @FXML
    void btnNomeAction(ActionEvent event) {
        AttendantDAOImp newEmail = new AttendantDAOImp();
        newEmail.callUClient(this.txtCPFCliente.getText(), this.name.getText(), this.txtNovoDado.getText());

        this.txtCPFCliente.clear();
        this.txtNovoDado.clear();

    }

    @FXML
    void btnTelefoneAction(ActionEvent event) {
        AttendantDAOImp newEmail = new AttendantDAOImp();
        newEmail.callUClient(this.txtCPFCliente.getText(), this.nPhone.getText(), this.txtNovoDado.getText());

        this.txtCPFCliente.clear();
        this.txtNovoDado.clear();

    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cliente");

    }

    @FXML
    void initialize() {
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert btnMenuAtualização != null : "fx:id=\"btnMenuAtualização\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert nPhone != null : "fx:id=\"nPhone\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert txtCPFCliente != null : "fx:id=\"txtCPFCliente\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";
        assert txtNovoDado != null : "fx:id=\"txtNovoDado\" was not injected: check your FXML file 'AtualizarCliente.fxml'.";

    }

}
