package Controller;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import Model.DAOImp.AttendantDAOImp;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAtendente;

    @FXML
    private Button btnGerente;

    @FXML
    private Button btnTecnico;

    @FXML
    void btnGerenteAction(ActionEvent event) {
        this.gerentePag("");
    }

    @FXML
    void btnTecnicoAction(ActionEvent event) {
        this.tecnicoPag("");
    }

    @FXML
    void btnatendenteAction(ActionEvent event) {
        /*
        //this.atentendentePag("src/View/Atendentee.fxml");
        try {
            FXMLLoader loader = new FXMLLoader();
            URL xmlURL = getClass().getResource("src/View/Atendentee.fxml");
            loader.setLocation(xmlURL);

            Parent parent = null;
            parent = loader.load();
            Scene scene = new Scene(parent);

            Stage cena = null;

            cena.setScene(scene);
            cena.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


    }

    public void atentendentePag(){

        try {
            /*
            // carrega o arquivo FXML da tela 2
            Parent root = FXMLLoader.load (getClass ().getResource ("View/Atendentee.fxml"));
            // cria uma nova cena com o conteúdo da tela 2
            Scene scene = new Scene (root);
            // obtém o palco atual
            Stage stage = (Stage) btnAtendente.getScene ().getWindow ();
            // define a nova cena no palco
            stage.setScene (scene);
            // mostra o palco
            stage.show ();

             */
            FXMLLoader loader = new FXMLLoader();
            Stage stage = new Stage();
            URL xmlURL = getClass().getResource("View/Atendentee.fxml");
            loader.setLocation(xmlURL);

            Parent parent = loader.load();

            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void tecnicoPag(String url){


    }
    public void gerentePag(String url){

    }

    @FXML
    void initialize() {
        assert btnAtendente != null : "fx:id=\"atendente\" was not injected: check your FXML file 'Main.fxml'.";
        assert btnGerente != null : "fx:id=\"gerente\" was not injected: check your FXML file 'Main.fxml'.";
        assert btnTecnico != null : "fx:id=\"tecnico\" was not injected: check your FXML file 'Main.fxml'.";

    }
}
