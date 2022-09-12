/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class FinishController implements Initializable {
    
//    Button finish;
    Button cancel;
    
    
//    public void FinishButton(ActionEvent event)throws IOException{
//        data fhobj = new data();
//        fhobj.createFile();
//        
//        Node  source = (Node)  event.getSource(); 
//        Stage stage  = (Stage) source.getScene().getWindow();
//        stage.close();
//        
//        
//        
//        
//    }
    public void CancelButton(ActionEvent event)throws IOException{
        
//        Platform.exit();
        Node  source = (Node)  event.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
