/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class StartScreenController implements Initializable {

    private String savefolderpath;
    public TextField browsepath;
    private Button browse_button;
    private Button next;

    
    public void NextButtonPushed(ActionEvent event)throws IOException{
        if(savefolderpath != null){
        Parent classParent = FXMLLoader.load(getClass().getResource("FileName.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        }
        else{
            AlertBox.display("Warning", "Can't Proceed without choosing destination folder");
        }
    }
    
    public void BrowseButtonPushed(ActionEvent event)throws IOException{
        Stage stage = null;
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(stage);
        
        if(selectedDirectory != null){
            this.savefolderpath = selectedDirectory.getAbsolutePath();
            data obj1 = new data();
            obj1.setpath(savefolderpath);
            try{
            browsepath.setText(savefolderpath);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            AlertBox.display("Error","Please Select a Folder");
            }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//         TODO

    }    
    
}
