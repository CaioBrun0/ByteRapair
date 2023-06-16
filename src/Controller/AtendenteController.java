package Controller;

import Model.Entities.OS;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AtendenteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<OS> listaOS;

    @FXML
    private Button btnCliente;

    @FXML
    private Button btnOS;

    @FXML
    void btnClienteAction(ActionEvent event) {

    }

    @FXML
    void btnOSAction(ActionEvent event) {

    }

    private ObservableList<OS> conteudoOS;





    @FXML
    void initialize() {
        /*

        try {
            FileReader reader = new FileReader("C:\\Users\\kmbma\\IdeaProjects\\ByteRapair2\\OS.json");
            Gson gson = new Gson();
            Type type = new TypeToken<List<OS>>(){}.getType();
            List<OS> OSjson = gson.fromJson(reader, type);

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

            this.conteudoOS = FXCollections.observableArrayList();
            this.conteudoOS.addAll(OSjson);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */



        assert listaOS != null : "fx:id=\"listaOS\" was not injected: check your FXML file 'atendente.fxml'.";




    }

}
