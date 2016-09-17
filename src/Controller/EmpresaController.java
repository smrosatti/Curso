/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FakeBD;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import Main.MEmpresa;
import Model.Empresa;
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

/**
 * FXML Controller class
 *
 * @author SARA
 */
public class EmpresaController implements Initializable {

    public void cadastrar() {
        //comentario
        try {
            Empresa emp = new Empresa();
            emp.setNome(nome.getText());
            emp.setNum(num.getText());
            emp.setCidade(city.getText());
            emp.setCnpj(cnpj.getText());
            emp.setEndereco(end.getText());
            emp.setEstado(estado.getText());
            emp.setCpf(cpf.getText());
            FakeBD.getEmpresas().add(emp);
            MEmpresa.getStage().close();
            Alert conf1 = new Alert(Alert.AlertType.CONFIRMATION);
            conf1.setHeaderText("Cadastro realizado com sucesso");
            conf1.show();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void sair() {
        try {
            MEmpresa.getStage().close();
        } catch (Exception ee) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ee);
        }
    }

    @FXML
    private Button cad;
    @FXML
    private Button can;
    @FXML
    private TextField nome;
    @FXML
    private TextField estado;
    @FXML
    private TextField cpf;
    @FXML
    private TextField cnpj;
    @FXML
    private TextField city;
    @FXML
    private TextField end;
    @FXML
    private TextField num;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

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
