package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.ManagerDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ServicoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdicionarServico;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtNomeServico;

    @FXML
    private TextField txtPrecoServico;

    @FXML
    void btnAdicionarServicoAction(ActionEvent event) {
        ManagerDAOImp servico = new ManagerDAOImp();
        servico.manageStockService(this.txtNomeServico.getText(), Integer.parseInt(this.txtPrecoServico.getText()));

        this.txtNomeServico.clear();
        this.txtPrecoServico.clear();
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("gerente");
    }

    @FXML
    void initialize() {
        assert btnAdicionarServico != null : "fx:id=\"btnAdicionarServico\" was not injected: check your FXML file 'Servico.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'Servico.fxml'.";

    }

}
