package app;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private static Stage stage;
    private static Scene mainScene, atendenteScene, tecnicoScene, gerenteScene, clienteScene, cadastroClienteScene;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        primaryStage.setTitle("Main1");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("View/Main.fxml"));
        mainScene = new Scene(fxmlMain);

        Parent fxmlAtendente = FXMLLoader.load(getClass().getResource("View/Atendentee.fxml"));
        atendenteScene = new Scene(fxmlAtendente);

        Parent fxmlTecnico = FXMLLoader.load(getClass().getResource("View/Tecnico.fxml"));
        tecnicoScene = new Scene(fxmlTecnico);

        Parent fxmlGerente = FXMLLoader.load(getClass().getResource("View/Gerente.fxml"));
        gerenteScene = new Scene(fxmlGerente);

        Parent fxmlCliente = FXMLLoader.load(getClass().getResource("View/Cliente.fxml"));
        clienteScene = new Scene(fxmlCliente);

        Parent fxmlCadastroCliente = FXMLLoader.load(getClass().getResource("View/CadastroCliente.fxml"));
        cadastroClienteScene = new Scene(fxmlCadastroCliente);

        primaryStage.setScene(mainScene);
        primaryStage.show();


    }

    public static void trocarTela(String scr){
        switch (scr){
            case "main":
                stage.setScene(mainScene);
                break;
            case "atendente":
                stage.setScene(atendenteScene);
                break;
            case "tecnico":
                stage.setScene(tecnicoScene);
                break;
            case "gerente":
                stage.setScene(gerenteScene);
                break;
            case "cliente":
                stage.setScene(clienteScene);
                break;
            case "cadastroCliente":
                stage.setScene(cadastroClienteScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}