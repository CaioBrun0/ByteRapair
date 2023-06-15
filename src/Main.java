import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private static Scene mainScene;
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        URL xmlURL = getClass().getResource("View/Peca.fxml");
        loader.setLocation(xmlURL);

        Parent parent = loader.load();

        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void trocarTela(String fxml) {
        try {
            // Carrega o arquivo FXML da próxima tela
            Parent root = FXMLLoader.load(Main.class.getResource(fxml));
            // Define o conteúdo da cena principal
            mainScene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}