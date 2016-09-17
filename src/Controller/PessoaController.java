/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.MPessoa;
import Model.FakeBD;
import Model.Pessoa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class PessoaController implements Initializable {

    public void cadastrar() {
        try {
            Pessoa p1 = new Pessoa();
            p1.setNome(nomef.getText());
            p1.setSobrenome(sobref.getText());
            p1.setEstado(estf.getText());
            p1.setCidade(cityf.getText());
            p1.setEmail(emailf.getText());
            p1.setEndereco(endf.getText());
            p1.setNum(numendf.getText());
            p1.setCpf(cpff.getText());
            p1.setRg(rgf.getText());
            FakeBD.getPessoas().add(p1);
            MPessoa.getStage().close();
            Alert conf2 = new Alert(Alert.AlertType.CONFIRMATION);
            conf2.setHeaderText("Cadastro realizado com sucesso");
            conf2.show();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void sair() {
        try {
            MPessoa.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    private Button can;
    @FXML
    private Button cad;
    @FXML
    private TextField nomef;
    @FXML
    private TextField cpff;
    @FXML
    private TextField cityf;
    @FXML
    private TextField estf;
    @FXML
    private TextField sobref;
    @FXML
    private TextField endf;
    @FXML
    private TextField numendf;
    @FXML
    private TextField rgf;
    @FXML
    private TextField emailf;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cad.setOnMouseClicked((MouseEvent e) -> {
            cadastrar();
        });

        cad.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                cadastrar();
            }
        });

        can.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                sair();
            }
        });

        can.setOnMouseClicked((MouseEvent e) -> {
            sair();

        });

    }

}
