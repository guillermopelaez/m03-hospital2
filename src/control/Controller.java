package control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Persona persona = new Persona();
    int[] contador = new int[6];

    ArrayList<Integer> valoresFisico;
    ArrayList<Integer> valoresAnimo;

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

        int animo= Integer.parseInt(txtAnimo.getText());
        int fisico= Integer.parseInt(txtFisico.getText());


        valoresAnimo.add(animo);
        valoresFisico.add(fisico);

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

        valoresAnimo = new ArrayList<>();
        valoresFisico = new ArrayList<>();









    }

    @FXML
    void clicarVeure(ActionEvent event) {

    }

    public void clicarVeure(javafx.event.ActionEvent actionEvent) {
        double mediaAnimo = 0;
        int sumaAnimo = 0;
        int sumaFisico = 0;
        double mediaFisico = 0;

        for (int i = 0; i < valoresAnimo.size(); i++) {
            sumaAnimo += valoresAnimo.get(i);


        }
        mediaAnimo = (sumaAnimo/valoresAnimo.size());


        for (int i = 0; i < valoresFisico.size(); i++) {
            sumaFisico += valoresFisico.get(i);


        }
        mediaFisico = (sumaFisico/valoresFisico.size());



        System.out.println(mediaAnimo);
        System.out.println(mediaFisico);
    }
}