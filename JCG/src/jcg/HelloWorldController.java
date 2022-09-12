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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class HelloWorldController implements Initializable {
    @FXML private Button generate;
    public void GenerateButtonPushed(ActionEvent event)throws IOException{
        FileHandling fh = new FileHandling();
        
        fh.createHelloWorld();
    }
    
   
    
    
    
    public void HomeButtonPushed(ActionEvent event)throws IOException{
        Parent classParent = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        Scene classScene = new Scene(classParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(classScene);
        window.show();
        
    }
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
