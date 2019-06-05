package control;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

import java.awt.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private JFXButton btnAfegir;

    @FXML
    private JFXButton btnVeure;

    @FXML
    private AnchorPane paneDret;

    @FXML
    private TextField textanim;

    @FXML
    private TextField textfisic;

    @FXML
    void onClickBtnMenu(ActionEvent event) {

    }
    @FXML
    private DatePicker fecha;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

