/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudteste;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author higor_x
 */
public class CrudTeste extends Application {
    
    @Override
    public void start(Stage stage) {
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            System.out.println("Erro em brir a gui");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
