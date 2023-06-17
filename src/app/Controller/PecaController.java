package app.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Model.DAOImp.ManagerDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class PecaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdicionarPeca;

    @FXML
    private MenuItem btnFontePeca;

    @FXML
    private MenuItem btnHSPeca;

    @FXML
    private MenuItem btnPlacaMaePeca;

    @FXML
    private MenuItem btnPlacaVideoPeca;

    @FXML
    private MenuItem btnRamPeca;

    @FXML
    private TextField txtCodigoPeca;

    @FXML
    private TextField txtPrecoPeca;

    @FXML
    private TextField txtQuantidadePeca;


    @FXML
    void btnFontePecaAction(ActionEvent event) {
        ManagerDAOImp manager = new ManagerDAOImp();
        manager.manageStockProdut(this.txtCodigoPeca.getText(), this.btnFontePeca.getText(), Double.parseDouble(this.txtPrecoPeca.getText()), Integer.parseInt(this.txtQuantidadePeca.getText()));

        this.txtCodigoPeca.clear();
        this.txtPrecoPeca.clear();
        txtQuantidadePeca.clear();

    }

    @FXML
    void btnHSPecaAction(ActionEvent event) {
        ManagerDAOImp manager = new ManagerDAOImp();
        manager.manageStockProdut(this.txtCodigoPeca.getText(), this.btnHSPeca.getText(), Double.parseDouble(this.txtPrecoPeca.getText()), Integer.parseInt(this.txtQuantidadePeca.getText()));

        this.txtCodigoPeca.clear();
        this.txtPrecoPeca.clear();
        txtQuantidadePeca.clear();

    }

    @FXML
    void btnPlacaMaePecaAction(ActionEvent event) {
        ManagerDAOImp manager = new ManagerDAOImp();
        manager.manageStockProdut(this.txtCodigoPeca.getText(), this.btnPlacaMaePeca.getText(), Double.parseDouble(this.txtPrecoPeca.getText()), Integer.parseInt(this.txtQuantidadePeca.getText()));

        this.txtCodigoPeca.clear();
        this.txtPrecoPeca.clear();
        txtQuantidadePeca.clear();

    }

    @FXML
    void btnPlacaVideoPecaAction(ActionEvent event) {
        ManagerDAOImp manager = new ManagerDAOImp();
        manager.manageStockProdut(this.txtCodigoPeca.getText(), this.btnPlacaVideoPeca.getText(), Double.parseDouble(this.txtPrecoPeca.getText()), Integer.parseInt(this.txtQuantidadePeca.getText()));

        this.txtCodigoPeca.clear();
        this.txtPrecoPeca.clear();
        txtQuantidadePeca.clear();

    }

    @FXML
    void btnRamPecaAction(ActionEvent event) {
        ManagerDAOImp manager = new ManagerDAOImp();
        manager.manageStockProdut(this.txtCodigoPeca.getText(), this.btnRamPeca.getText(), Double.parseDouble(this.txtPrecoPeca.getText()), Integer.parseInt(this.txtQuantidadePeca.getText()));

        this.txtCodigoPeca.clear();
        this.txtPrecoPeca.clear();
        txtQuantidadePeca.clear();

    }

    @FXML
    void initialize() {


        assert btnAdicionarPeca != null : "fx:id=\"btnAdicionarPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert btnFontePeca != null : "fx:id=\"btnFontePeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert btnHSPeca != null : "fx:id=\"btnHSPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert btnPlacaMaePeca != null : "fx:id=\"btnPlacaMaePeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert btnPlacaVideoPeca != null : "fx:id=\"btnPlacaVideoPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert btnRamPeca != null : "fx:id=\"btnRamPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert txtCodigoPeca != null : "fx:id=\"txtCodigoPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert txtPrecoPeca != null : "fx:id=\"txtPrecoPeca\" was not injected: check your FXML file 'peca.fxml'.";
        assert txtQuantidadePeca != null : "fx:id=\"txtQuantidadePeca\" was not injected: check your FXML file 'peca.fxml'.";

    }
}
