/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pessoa;
import Model.Empresa;
import Main.MEmpresa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import Main.MEmpresa;
import Main.MPessoa;
import Model.FakeBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button cade;
    @FXML
    private Button cadp;
    @FXML
    private Button cone;
    @FXML
    private Button conp;

    public void cade() {
        try {
            MEmpresa cade = new MEmpresa();
            cade.start(new Stage());

        } catch (Exception ee) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ee);
        }
    }

    public void cadp() {

        try {
            MPessoa cadp = new MPessoa();
            cadp.start(new Stage());

        } catch (Exception ee) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ee);
        }
    }

    public void cone() {
        try {
            System.out.println("---------------- MOSTRANDO EMPRESAS -----------------");
            for (int x = 0; x < FakeBD.getEmpresas().size(); x++) {
                FakeBD.getEmpresas().get(x).mostrarEmpresa();
            }
        } catch (Exception ee) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ee);
        }
    }

    public void conp() {
        try {
            System.out.println("---------------- MOSTRANDO PESSOAS -----------------");
            for (int x = 0; x < FakeBD.getPessoas().size(); x++) {
                FakeBD.getPessoas().get(x).mostrarPessoa();
            }
        } catch (Exception ec) {
            ec.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        cade.setOnMouseClicked((MouseEvent e) -> {
            cade();
        });

        cade.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                cade();
            }
        });

        cadp.setOnMouseClicked((MouseEvent e) -> {
            cadp();

        });

        cadp.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                cadp();
            }
        });

        cone.setOnMouseClicked((MouseEvent e) -> {
            cone();

        });

        cone.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                cone();
            }
        });

        conp.setOnMouseClicked((MouseEvent e) -> {
            conp();
        });

        conp.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                conp();
            }
        });
    }
}
