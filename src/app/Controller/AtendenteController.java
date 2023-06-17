package app.Controller;

import app.Main;
import app.Model.Entities.OS;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AtendenteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button btnVoltar;

    @FXML
    private TableView<OS> listaOS;

    @FXML
    private Button btnCliente;

    @FXML
    private Button btnOS;
    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("main");
    }

    @FXML
    void btnClienteAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cliente");

    }

    @FXML
    void btnOSAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("OS");

    }

    private ObservableList<OS> conteudoOS;





    @FXML
    void initialize() {

        assert listaOS != null : "fx:id=\"listaOS\" was not injected: check your FXML file 'atendente.fxml'.";




    }

}
