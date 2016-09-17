/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SARA
 */
public class MLogin extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stagep) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));

        Scene scene = new Scene(root);

        stagep.setTitle("Login");
        stagep.setScene(scene);
        stagep.show();

        MLogin.stage = stagep;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return MLogin.stage;
    }

    public void setStage(Stage s) {
        MLogin.stage = s;
    }

}
