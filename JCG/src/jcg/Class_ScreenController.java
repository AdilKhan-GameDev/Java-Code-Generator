package jcg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class Class_ScreenController implements Initializable {
    @FXML private TextField class_Name;
    @FXML private TextField class_Type;
    @FXML private TextField class_Modifier;
    @FXML private Button generate;
    @FXML private Button showcode;
    
    public void ShowButtonPushed(ActionEvent event)throws IOException{
        
        Parent Show = FXMLLoader.load(getClass().getResource("ShowCode.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Generated Code");
        stage.setScene(new Scene(Show, 450, 450));
        
        stage.show();
        
        
    }
    
    public void GenerateButtonPushed(ActionEvent event)throws IOException{
        FileHandling fh = new FileHandling();
        
        fh.setACName(class_Name.getText());
        fh.setACScope(class_Type.getText());
        fh.setACAccess(class_Modifier.getText());
        
        fh.createClass();
    }
    public void HomeButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
//    
//     public void ShowButtonPushed(ActionEvent event)throws IOException{
//
//         showcode.setOnAction(new EventHandler<ActionEvent>() {
//
//    public void handle(ActionEvent event) {
//
//        Parent root2;
//        try {
//            root2 = FXMLLoader.load(getClass().getClassLoader().getResource("Interface.fxml"));
//            Stage stage = new Stage();
//            stage.setTitle("My New Stage Title");
//            stage.setScene(new Scene(root2, 450, 450));
//            stage.show();
//            // Hide this current window (if this is what you want)
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        }
//        });
//        }
    public void HelloWorldButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void EnumButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Enum.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void ClassButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Class_Screen.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
     public void MainClassButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("MainClass.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
     public void InterfaceButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void ConstuctorButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Constructor.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
   
    public void NewVariableButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("NewVariable.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
     public void FunctionButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Function_Screen.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void ToStringButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("ToString.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void RecursionButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Recursion.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void LoopsButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Looping.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void InheritenceButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Inheritence.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    
    public void AggregationButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Aggregation.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void OverridingButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Overriding.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void OverloadingButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("Overloading.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
    public void ExceptionHandlingButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("ExceptionHandling.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        }
}
    
        
    

