package app.Controller;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import app.Main;
import app.Model.ENUM.Status;
import app.Model.Entities.OS;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OSController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAtualizarOS;

    @FXML
    private Button btnCancelarOS;

    @FXML
    private Button btnCriarOS;

    @FXML
    private Button btnProcurarOS;

    @FXML
    private TableView<OS> listaOS;
    private ObservableList<OS> conteudoOS;
    @FXML
    private Button btnVoltar;


    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("main");

    }
    @FXML
    void btnAtualizarOSAction(ActionEvent event) {

    }

    @FXML
    void btnCancelarOSAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cancelarOS");
    }

    @FXML
    void btnCriarOSAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("criarOS");

    }

    @FXML
    void btnProcurarOSAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("procurarOS");
    }

    @FXML
    void initialize() {

        this.conteudoOS = FXCollections.observableArrayList();

        TableColumn descriçãoColun = new TableColumn("Descrição");
        TableColumn CPFColun = new TableColumn("CPF");
        TableColumn OSidColun = new TableColumn("ID");
        TableColumn horaInicioColun = new TableColumn("Inicio");
        TableColumn statusColun = new TableColumn("Status");
        TableColumn peçasColun = new TableColumn("Peças");

        descriçãoColun.setCellFactory(new PropertyValueFactory<OS, String>("description"));
        CPFColun.setCellFactory(new PropertyValueFactory<OS, String>("clientID"));
        OSidColun.setCellFactory(new PropertyValueFactory<OS, String>("osID"));
        horaInicioColun.setCellFactory(new PropertyValueFactory<OS, Date>("starTime"));
        statusColun.setCellFactory(new PropertyValueFactory<OS, Status>("status"));
        peçasColun.setCellFactory(new PropertyValueFactory<OS, String>("usedParts"));

        this.listaOS.getColumns().addAll(descriçãoColun, CPFColun, OSidColun, horaInicioColun, statusColun, peçasColun);
        this.listaOS.setItems(conteudoOS);

        assert btnAtualizarOS != null : "fx:id=\"btnAtualizarOS\" was not injected: check your FXML file 'OS.fxml'.";
        assert btnCancelarOS != null : "fx:id=\"btnCancelarOS\" was not injected: check your FXML file 'OS.fxml'.";
        assert btnCriarOS != null : "fx:id=\"btnCriarOS\" was not injected: check your FXML file 'OS.fxml'.";
        assert btnProcurarOS != null : "fx:id=\"btnProcurarOS\" was not injected: check your FXML file 'OS.fxml'.";

    }

}
