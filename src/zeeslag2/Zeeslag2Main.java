/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeeslag2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jonas
 */
public class Zeeslag2Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Bord model = new Bord(10);
        
        
        FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLZeeslag2View.fxml"));
        Parent root = lader.load();
        FXMLZeeslag2ViewController controller = lader.getController();
        
        controller.setModel(model);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
