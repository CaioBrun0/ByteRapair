package Controller;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button atendente;

    @FXML
    private Button gerente;

    @FXML
    private Button tecnico;

    @FXML
    void atendenteAction(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da outra tela
            Parent root = FXMLLoader.load(getClass().getResource("C:\\Users\\kmbma\\IdeaProjects\\ByteRapair2\\src\\View\\atendente.fxml"));
            // Cria um objeto Scene com o conteúdo da outra tela
            Scene cena = new Scene(root);
            // Obtém o objeto Stage atual
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            // Troca a cena atual pela nova cena
            stage.setScene(cena);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    void gerenteAction(ActionEvent event) {

    }

    @FXML
    void tecnicoAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert atendente != null : "fx:id=\"atendente\" was not injected: check your FXML file 'Main.fxml'.";
        assert gerente != null : "fx:id=\"gerente\" was not injected: check your FXML file 'Main.fxml'.";
        assert tecnico != null : "fx:id=\"tecnico\" was not injected: check your FXML file 'Main.fxml'.";

    }
}
