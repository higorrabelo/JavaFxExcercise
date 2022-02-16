package gui;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController implements Initializable {

    @FXML 
    private Button btClick;
    @FXML
    private Label lbText;
    @FXML
    public void setBtClickButton(){
        lbText.setText("Tudo");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
