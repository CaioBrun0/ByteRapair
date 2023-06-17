package app.Controller;

import app.Main;
import app.Model.DAOImp.AttendantDAOImp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProcurarClienteController {

    @FXML
    private Button btnProcurar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label labelError;

    @FXML
    private TextField txtCPFCliente;

    @FXML
    void btnProcurarAction(ActionEvent event) {
        AttendantDAOImp procurar = new AttendantDAOImp();
        procurar.callRClient(this.txtCPFCliente.getText());

        this.txtCPFCliente.clear();
    }

    @FXML
    void btnVoltarAction(ActionEvent event) {
        Main main = new Main();
        main.trocarTela("cliente");
    }

}
