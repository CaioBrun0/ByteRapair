package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.ENUM.Status;
import app.Model.Entities.Client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnAtualizarCliente;

    @FXML
    private Button btnCadastrarCliente;

    @FXML
    private Button btnDeletarCliente;

    @FXML
    private Button btnProcurarCliente;

    @FXML
    private Button btnReceberPagamento;
    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("atendente");
    }

    @FXML
    private TableView<Client> listaClientes;
    private ObservableList<Client> conteudoClientes;

    @FXML
    void btnAtualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void btnCadastrarClienteAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cadastroCliente");

    }

    @FXML
    void btnDeletarClienteAction(ActionEvent event) {

    }

    @FXML
    void btnProcurarClienteAction(ActionEvent event) {

    }

    @FXML
    void btnReceberPagamentoAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        this.conteudoClientes = FXCollections.observableArrayList();

        TableColumn nomeColun = new TableColumn("Nome");
        TableColumn CPFColun = new TableColumn("CPF");
        TableColumn contatoColun = new TableColumn("Contato");
        TableColumn emailColun = new TableColumn("Email");
        TableColumn endereçoColun = new TableColumn("Endereço");

        nomeColun.setCellFactory(new PropertyValueFactory<Client, String>("name"));
        CPFColun.setCellFactory(new PropertyValueFactory<Client, String>("clientID"));
        contatoColun.setCellFactory(new PropertyValueFactory<Client, String>("nPhone"));
        emailColun.setCellFactory(new PropertyValueFactory<Client, String>("email"));
        endereçoColun.setCellFactory(new PropertyValueFactory<Client, Status>("address"));


        this.listaClientes.getColumns().addAll(nomeColun, CPFColun, contatoColun, emailColun, endereçoColun);
        this.listaClientes.setItems(conteudoClientes);


        assert btnAtualizarCliente != null : "fx:id=\"btnAtualizarCliente\" was not injected: check your FXML file 'Cliente.fxml'.";
        assert btnCadastrarCliente != null : "fx:id=\"btnCadastrarCliente\" was not injected: check your FXML file 'Cliente.fxml'.";
        assert btnDeletarCliente != null : "fx:id=\"btnDeletarCliente\" was not injected: check your FXML file 'Cliente.fxml'.";
        assert btnProcurarCliente != null : "fx:id=\"btnProcurarCliente\" was not injected: check your FXML file 'Cliente.fxml'.";
        assert btnReceberPagamento != null : "fx:id=\"btnReceberPagamento\" was not injected: check your FXML file 'Cliente.fxml'.";

    }

}
