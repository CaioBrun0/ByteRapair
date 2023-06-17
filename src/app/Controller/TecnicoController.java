package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.TechnicianDAOImp;
import app.Model.Entities.OS;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class TecnicoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnFinalizarPedido;

    @FXML
    private Button btnPegarPedido;

    @FXML
    private TableView<OS> listaOS;
    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("main");
    }

    @FXML
    void btnFinalizarPedidoAction(ActionEvent event) {
        TechnicianDAOImp tecnico = new TechnicianDAOImp();
        tecnico.takeService();
    }

    @FXML
    void btnPegarPedidoAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnFinalizarPedido != null : "fx:id=\"btnFinalizarPedido\" was not injected: check your FXML file 'Tecnico.fxml'.";
        assert btnPegarPedido != null : "fx:id=\"btnPegarPedido\" was not injected: check your FXML file 'Tecnico.fxml'.";
        assert listaOS != null : "fx:id=\"listaOS\" was not injected: check your FXML file 'Tecnico.fxml'.";

    }

}