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
    private static Scene mainScene, atendenteScene, tecnicoScene, gerenteScene, clienteScene, OSScene, cadastroClienteScene, atualizarClienteScene, deletarClieteScene, procurarClienteScene, receberPagamentoScene, criarOSScene, atualizarOSScene, cancelarOSScene, procurarOSSCene, gerarFaturaScene, adicionarPecaScene, adicionarServicoScene;


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

        Parent fxmlOS = FXMLLoader.load(getClass().getResource("View/OS.fxml"));
        OSScene = new Scene(fxmlOS);

        Parent fxmlCadastroCliente = FXMLLoader.load(getClass().getResource("View/CadastroCliente.fxml"));
        cadastroClienteScene = new Scene(fxmlCadastroCliente);

        Parent fxmlAtualizarCliente = FXMLLoader.load(getClass().getResource("View/AtualizarCliente.fxml"));
        atualizarClienteScene = new Scene(fxmlAtualizarCliente);

        Parent fxmlDeletarCliente = FXMLLoader.load(getClass().getResource("View/DeletarCliente.fxml"));
        deletarClieteScene = new Scene(fxmlDeletarCliente);

        Parent fxmlProcurarCliente = FXMLLoader.load(getClass().getResource("View/ProcurarCliente.fxml"));
        procurarClienteScene = new Scene(fxmlProcurarCliente);

        Parent fxmlReceberPagamento = FXMLLoader.load(getClass().getResource("View/ReceberPagamento.fxml"));
        receberPagamentoScene = new Scene(fxmlReceberPagamento);

        Parent fxmlCriarOS = FXMLLoader.load(getClass().getResource("View/CriarOS.fxml"));
        criarOSScene = new Scene(fxmlCriarOS);

        Parent fxmlAtualizarOS = FXMLLoader.load(getClass().getResource("View/AtualizarOS.fxml"));
        atualizarOSScene = new Scene(fxmlAtualizarOS);

        Parent fxmlCancelarOS = FXMLLoader.load(getClass().getResource("View/CancelarOS.fxml"));
        cancelarOSScene = new Scene(fxmlCancelarOS);

        Parent fxmlProcurarOS = FXMLLoader.load(getClass().getResource("View/ProcurarOS.fxml"));
        procurarOSSCene = new Scene(fxmlProcurarOS);

        Parent fxmlGerarFatura = FXMLLoader.load(getClass().getResource("View/gerarFatura.fxml"));
        gerarFaturaScene = new Scene(fxmlGerarFatura);

        Parent fxmlAdicionarPeca = FXMLLoader.load(getClass().getResource("View/Peca.fxml"));
        adicionarPecaScene = new Scene(fxmlAdicionarPeca);

        Parent fxmlAdicionarServico = FXMLLoader.load(getClass().getResource("View/Servico.fxml"));
        adicionarServicoScene = new Scene(fxmlAdicionarServico);


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
            case "atualizarCliente":
                stage.setScene(atualizarClienteScene);
                break;
            case "deletarCliente":
                stage.setScene(deletarClieteScene);
                break;
            case "procurarCliente":
                stage.setScene(procurarClienteScene);
                break;
            case "receberPagamento":
                stage.setScene(receberPagamentoScene);
                break;
            case "OS":
                stage.setScene(OSScene);
                break;
            case "criarOS":
                stage.setScene(criarOSScene);
                break;
            case "atualizarOS":
                stage.setScene(atualizarOSScene);
                break;
            case "cancelarOS":
                stage.setScene(cancelarOSScene);
                break;
            case "procurarOS":
                stage.setScene(procurarOSSCene);
                break;
            case "gerarFatura":
                stage.setScene(gerarFaturaScene);
                break;
            case "adicionarPeca":
                stage.setScene(adicionarPecaScene);
                break;
            case "adicionarServico":
                stage.setScene(adicionarServicoScene);
                break;

        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}