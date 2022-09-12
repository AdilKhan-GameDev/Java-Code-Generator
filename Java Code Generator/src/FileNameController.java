/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class FileNameController implements Initializable {
    
    @FXML Button next;
    @FXML Button back;
    @FXML TextField filename;
    private String name;
    
    public void setname(){
        this.name = filename.getText();
        data obj = new data();
        obj.setname(this.filename.getText());
    }

    public void NextButton(ActionEvent event)throws IOException{
        this.setname();
        if(this.name != null){
        System.out.println(this.name);
        Parent classParent = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        }
        else{
            AlertBox.display("Warning", "Provide File/Class Name");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
