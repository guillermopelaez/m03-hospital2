package control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Persona persona = new Persona();
    int[] contador = new int[6];

    @FXML
    private Button btnAfegir;

    @FXML
    private Button btnVeure;

    @FXML
    private Button btnLlet;

    @FXML
    private Button btnCereales;

    @FXML
    private Button btnPasta;

    @FXML
    private Button btnFruita;

    @FXML
    private Button btnAigua;

    @FXML
    private Button btnAlcohol;

    @FXML
    private Button btnSuc;

    @FXML
    private TextField txtAnimo;

    @FXML
    private TextField txtFisico;

    @FXML
    private TextArea txtResultado;

    @FXML
    private Button btnGuardar;

    @FXML
    void Clicar(ActionEvent event) {

    }

    @FXML
    void ClicarGuardar(ActionEvent event) {
        for (int i = 0; i <persona.animodias.size() ; i++) {
            persona.animodias.add(txtAnimo.getText());

        }

    }

    @FXML
    void ClicarAigua(ActionEvent event) {
        contador[6]++;
    }

    @FXML
    void ClicarAlcohol(ActionEvent event) {
        contador[5]++;
    }


    @FXML
    void ClicarSuc(ActionEvent event) {
        contador[4]++;
    }

    @FXML
    void Clicarcereales(ActionEvent event) {
        contador[3]++;
    }

    @FXML
    void Clicarfruita(ActionEvent event) {
        contador[2]++;
    }

    @FXML
    void Clicarllet(ActionEvent event) {
        contador[0]++;
    }

    @FXML
    void Clicarpasta(ActionEvent event) {
        contador[1]++;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtAnimo.setText("un valor de 0 a 5");
        txtFisico.setText("un valor de 0 a 5");


    }
}