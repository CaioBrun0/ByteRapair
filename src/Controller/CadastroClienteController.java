package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import Model.DAOImp.AttendantDAOImp;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCadastrarCliente;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    private TextField txtCepCliente;

    @FXML
    private TextField txtEmailCliente;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtTelefoneCliente;

    @FXML
    void btnCadastrarClienteAction(ActionEvent event) {
        this.cadastrarCliente();

    }

    public void cadastrarCliente(){
        AttendantDAOImp attendant = new AttendantDAOImp();
        attendant.callCClient(this.txtCPFCliente.getText(), this.txtNomeCliente.getText(), this.txtTelefoneCliente.getText(), this.txtEmailCliente.getText(), this.txtCepCliente.getText());

        this.txtCPFCliente.clear();
        this.txtNomeCliente.clear();
        this.txtTelefoneCliente.clear();
        this.txtEmailCliente.clear();
        this.txtCepCliente.clear();
    }


    @FXML
    void initialize() {
        assert txtCPFCliente != null : "fx:id=\"CPFCliente\" was not injected: check your FXML file 'CadastroCliente.fxml'.";
        assert txtCepCliente != null : "fx:id=\"cepCLiente\" was not injected: check your FXML file 'CadastroCliente.fxml'.";
        assert txtEmailCliente != null : "fx:id=\"emailCliente\" was not injected: check your FXML file 'CadastroCliente.fxml'.";
        assert txtNomeCliente != null : "fx:id=\"nomeCliente\" was not injected: check your FXML file 'CadastroCliente.fxml'.";
        assert txtTelefoneCliente != null : "fx:id=\"telefoneCliente\" was not injected: check your FXML file 'CadastroCliente.fxml'.";


    }

}
