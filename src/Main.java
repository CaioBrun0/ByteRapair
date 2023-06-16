import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private static Scene mainScene;
    private static Scene atendenteScene;
    public static Scene stage;
    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage.getScene();

        FXMLLoader fxmlLoader = new FXMLLoader();
        URL xmlURLMain = getClass().getResource("View/Peca.fxml");
        fxmlLoader.setLocation(xmlURLMain);
        Parent parentMain = fxmlLoader.load();
        mainScene = new Scene(parentMain);
        primaryStage.setScene(mainScene);
        primaryStage.show();

        FXMLLoader atendenteLoader = new FXMLLoader();
        URL xmlURLAtendente = getClass().getResource("View/Atendentee.fxml");
        atendenteLoader.setLocation(xmlURLAtendente);
        Parent parentAtendente = atendenteLoader.load();
        atendenteScene = new Scene(parentAtendente);


    }

    public void trocarTela(String fxml) {
        switch (fxml){
            case "btnAtendentePag":

        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}