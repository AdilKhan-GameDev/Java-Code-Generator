/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class ShowCodeController implements Initializable {
    
    private TextArea textfield;
    
    
    
    public void onaction(ActionEvent event)throws IOException{
//        FileHandling obj = new FileHandling();
//        
//        obj.readTemplates();
        Class_ScreenController obj = new Class_ScreenController();
        
            obj.ShowButtonPushed(event);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
