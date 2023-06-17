package app.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import app.Main;
import app.Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CriarOSController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCriarOS;

    @FXML
    private MenuItem btnFonte;

    @FXML
    private MenuItem btnHDSSD;

    @FXML
    private MenuItem btnPlacaMae;

    @FXML
    private MenuItem btnPlacaVideo;
    @FXML
    private MenuItem btnProgramas;
    @FXML
    private MenuItem btnRAM;

    @FXML
    private MenuItem btnInstalarOS;

    @FXML
    private MenuItem btnLimpeza;

    @FXML
    private Button btnVoltar;

    @FXML
    private ListView<String> listaPecas;

    @FXML
    private MenuButton menuBotao;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextArea txtDescrição;

    @FXML
    void btnProgramasAction(ActionEvent event) {
        String item = this.btnProgramas.getText();
        listaPecas.getItems().add(item);
    }
    @FXML
    void btnLimpezaAction(ActionEvent event) {
        String item = this.btnLimpeza.getText();
        listaPecas.getItems().add(item);
    }
    @FXML
    void btnInstalarOSAction(ActionEvent event) {
        String item = this.btnInstalarOS.getText();
        listaPecas.getItems().add(item);
    }
    @FXML
    void btnCriarOSAction(ActionEvent event) {
        this.criarOS();
    }

    public void criarOS(){
        AttendantDAOImp criarOS = new AttendantDAOImp();
        ArrayList<String> pecas = new ArrayList<>();
        pecas.addAll(listaPecas.getItems());
        criarOS.callCOS(this.txtDescrição.getText(), this.txtCPF.getText(), pecas);

        this.txtDescrição.clear();
        this.txtCPF.clear();
        pecas.clear();
        listaPecas.getItems().clear();

    }
    @FXML
    void btnFonteAction(ActionEvent event) {
        String item = this.btnFonte.getText();
        listaPecas.getItems().add(item);

    }

    @FXML
    void btnHDSSDAction(ActionEvent event) {
        String item = this.btnHDSSD.getText();
        listaPecas.getItems().add(item);
    }

    @FXML
    void btnPlacaMaeAction(ActionEvent event) {
        String item = this.btnPlacaMae.getText();
        listaPecas.getItems().add(item);
    }

    @FXML
    void btnPlacaVideoAction(ActionEvent event) {
        String item = this.btnPlacaVideo.getText();
        listaPecas.getItems().add(item);

    }

    @FXML
    void btnRAMAcntion(ActionEvent event) {
        String item = String.valueOf(this.btnRAM.getText());
        listaPecas.getItems().add(item);

    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("OS");

    }

    @FXML
    void menuBotaoAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCriarOS != null : "fx:id=\"btnCriarOS\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert btnRAM != null : "fx:id=\"btnRAM\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert btnVoltar != null : "fx:id=\"btnVoltar\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert listaPecas != null : "fx:id=\"listaPecas\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert menuBotao != null : "fx:id=\"menuBotao\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtCPF != null : "fx:id=\"txtCPF\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtDescrição != null : "fx:id=\"txtDescrição\" was not injected: check your FXML file 'CriarOS.fxml'.";

    }

}
