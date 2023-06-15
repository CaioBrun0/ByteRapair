package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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
    private TextField txtCPF;

    @FXML
    private TextArea txtDescrição;

    @FXML
    private Button btnAdicionarPeca;
    @FXML
    private TextField txtPeca;
    @FXML
    private ListView<String> listaPecas;

    @FXML
    void btnAdicionarPecaAction(ActionEvent event) {

    }

    @FXML
    void btnCriarOSAction(ActionEvent event) {
        this.criarOS();
    }

    public void criarOS(){
        ArrayList<String> pecas = new ArrayList<>();
        pecas.addAll(listaPecas.getItems());
        AttendantDAOImp atendente = new AttendantDAOImp();
        atendente.callCOS(this.txtDescrição.getText(), this.txtCPF.getText(), pecas);

        txtDescrição.clear();
        txtCPF.clear();
        listaPecas.getItems().clear();
        pecas.clear();
    }

    @FXML
    void initialize() {
        btnAdicionarPeca.setOnAction(event ->{
            String item = txtPeca.getText();
            listaPecas.getItems().add(item);
            txtPeca.clear();
        });




        assert btnCriarOS != null : "fx:id=\"btnCriarOS\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtCPF != null : "fx:id=\"txtCPF\" was not injected: check your FXML file 'CriarOS.fxml'.";
        assert txtDescrição != null : "fx:id=\"txtDescrição\" was not injected: check your FXML file 'CriarOS.fxml'.";

    }

}
