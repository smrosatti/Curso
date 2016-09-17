/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SARA
 */
public class MPrincipal extends Application {
    
    @Override
    public void start(Stage Stage) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("/View/Principal.fxml"));
        Scene scene = new Scene(root);
        
        Stage.setTitle("Principal");
        Stage.setScene(scene);
        Stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
