package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.ManagerDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GerenteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnAdicionarPeca;

    @FXML
    private Button btnAdicionarServico;

    @FXML
    private Button btnListaClientes;

    @FXML
    private Button btnListaFaturas;
    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("main");

    }

    @FXML
    void btnAdicionarPecaAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("adicionarPeca");
    }

    @FXML
    void btnAdicionarServicoAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("adicionarServico");
    }

    @FXML
    void btnListaClientesAction(ActionEvent event) {
        ManagerDAOImp listClientes = new ManagerDAOImp();
        listClientes.viewCLients();
    }

    @FXML
    void btnListaFaturasAction(ActionEvent event) {
        ManagerDAOImp listFaturas = new ManagerDAOImp();
        listFaturas.viewCLients();
    }

    @FXML
    void initialize() {
        assert btnAdicionarPeca != null : "fx:id=\"btnAdicionarPeca\" was not injected: check your FXML file 'Gerente.fxml'.";
        assert btnAdicionarServico != null : "fx:id=\"btnAdicionarServico\" was not injected: check your FXML file 'Gerente.fxml'.";
        assert btnListaClientes != null : "fx:id=\"btnListaClientes\" was not injected: check your FXML file 'Gerente.fxml'.";
        assert btnListaFaturas != null : "fx:id=\"btnListaFaturas\" was not injected: check your FXML file 'Gerente.fxml'.";

    }

}