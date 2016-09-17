/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.MLogin;
import Main.MPrincipal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author SARA
 */
public class LoginController implements Initializable {

    public void logar() {
        if (u.getText().equals("user") && s.getText().equals("user123")) {
            try {
                MPrincipal btcon = new MPrincipal();
                btcon.start(new Stage());
                MLogin.getStage().close();
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Alert errol = new Alert(AlertType.ERROR);
            errol.setHeaderText("Usuário ou senha informados estão incorretos");
            errol.setContentText("Tente novamente");
            errol.show();
        }
    }

    public void fechar() {
        try {
            MLogin.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    private Label label;
    @FXML
    private Button btcon;
    @FXML
    private Button btsair;
    @FXML
    private TextField u;
    @FXML
    private PasswordField s;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btcon.setOnMouseClicked((MouseEvent e) -> {
            logar();
        });

        btcon.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                logar();
            }
        });

        s.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.ENTER) {
                logar();
            }
        });

        btsair.setOnMouseClicked((MouseEvent e) -> {
            fechar();
        });

        btsair.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                fechar();
            }
        });

    }
}
