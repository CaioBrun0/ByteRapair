package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class AtendenteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button abrirOS;

    @FXML
    private Button atualizarCliente;

    @FXML
    private Button cadastrarCliente;

    @FXML
    private Button excluirCliente;

    @FXML
    private Button listaClientes;

    @FXML
    private TableView<?> listaOS;

    @FXML
    private Button receberPagamento;

    @FXML
    void abrirOSAction(ActionEvent event) {

    }

    @FXML
    void atualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void cadastrarClienteAction(ActionEvent event) {

    }

    @FXML
    void excluirClienteAction(ActionEvent event) {

    }

    @FXML
    void listaClientesAction(ActionEvent event) {

    }

    @FXML
    void receberPagamentoAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert abrirOS != null : "fx:id=\"abrirOS\" was not injected: check your FXML file 'atendente.fxml'.";
        assert atualizarCliente != null : "fx:id=\"atualizarCliente\" was not injected: check your FXML file 'atendente.fxml'.";
        assert cadastrarCliente != null : "fx:id=\"cadastrarCliente\" was not injected: check your FXML file 'atendente.fxml'.";
        assert excluirCliente != null : "fx:id=\"excluirCliente\" was not injected: check your FXML file 'atendente.fxml'.";
        assert listaClientes != null : "fx:id=\"listaClientes\" was not injected: check your FXML file 'atendente.fxml'.";
        assert listaOS != null : "fx:id=\"listaOS\" was not injected: check your FXML file 'atendente.fxml'.";
        assert receberPagamento != null : "fx:id=\"receberPagamento\" was not injected: check your FXML file 'atendente.fxml'.";

    }

}
