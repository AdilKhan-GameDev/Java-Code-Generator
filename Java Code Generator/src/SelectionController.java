/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HVARZM
 */
public class SelectionController implements Initializable {
    
    ObservableList<String> scopelist = FXCollections.observableArrayList("static", "Non-Static");
    ObservableList<String> accesslist = FXCollections.observableArrayList("public", "private", "protected", "Default");
    ObservableList<String> returnlist = FXCollections.observableArrayList("int", "double", "String", "boolean");
    
    
    
    
    //anchorpanes
    @FXML AnchorPane classanchor;
    @FXML AnchorPane inheritenceanchor;
    @FXML AnchorPane functionanchor;
    @FXML AnchorPane interfaceanchor;
    @FXML AnchorPane helloanchor;
    //class choice
    @FXML CheckBox constructorbox;
    @FXML CheckBox mainbox;
    @FXML CheckBox tostringbox;
    @FXML CheckBox instancebox;
    //inheritence choices
    @FXML CheckBox childbox;
    @FXML CheckBox aggbox;
    @FXML CheckBox loadingbox;
    @FXML CheckBox ridingbox;
    //functions choices
    @FXML CheckBox mmainbox;
    @FXML CheckBox tobox;
    @FXML CheckBox setbox;
    @FXML CheckBox getbox;
    @FXML CheckBox recursionbox;
    //interface choices
    @FXML CheckBox interbox;
    //class combos
    @FXML ComboBox<String> cscopecombo;
    @FXML ComboBox<String> caccesscombo;
    @FXML ComboBox<String> iscopecombo;
    @FXML ComboBox<String> iaccesscombo;
    @FXML ComboBox<String> ireturncombo;
    @FXML ComboBox<String> taccesscombo;
    @FXML ComboBox<String> tascopecombo;
    //inheritence combos
    @FXML ComboBox<String> childaccesscombo;
    @FXML ComboBox<String> aggaccesscombo;
    @FXML ComboBox<String> aggascopecombo;
    @FXML ComboBox<String> loadingreturn2combo;
    @FXML ComboBox<String> loadingreturncombo;
    @FXML ComboBox<String> ridingaccesscombo;
    @FXML ComboBox<String> ridingascopecombo;
    @FXML ComboBox<String> ridingareturncombo;
    //function combos
    @FXML ComboBox<String> toscopecombo;
    @FXML ComboBox<String> toaccesscombo;
    @FXML ComboBox<String> setscopecombo;
    @FXML ComboBox<String> setaccesscombo;
    @FXML ComboBox<String> getscopecombo;
    @FXML ComboBox<String> getaccesscombo;
    @FXML ComboBox<String> getreturncombo;
    @FXML ComboBox<String> recursivescopecommbo;
    @FXML ComboBox<String> recursiveaccesscommbo;
    @FXML ComboBox<String> recursivereturncommbo;
    //interface combos
    @FXML ComboBox<String> interaccesscombo;
    // show buttons
    @FXML Button showcodeclass;
    @FXML Button showcodeinheritence;
    @FXML Button showcodefunction;
    @FXML Button showcodeinterface;
    @FXML Button showcodehello;
    //generate button
    @FXML Button generatefileclass;
    @FXML Button generatefilefunction;
    @FXML Button generatefileinheritence;
    @FXML Button generatefileinterface;
    @FXML Button generatefilehello;
    //Tab instances
    @FXML Tab classtab;
    @FXML Tab inheritencetab;
    @FXML Tab functiontab;
    @FXML Tab interfacetab;
    @FXML Tab hellotab;
    
    
    //class data collectors
    String constscope, classtostringscope, instancescope = "";
    String constaccess, classtostringaccess, instanceaccess = "";
    String instancereturn = "";
     
    //inheritence data collectors
    String childscope, aggscope, loadingreturn2, ridingscope = "";
    String childaccess, aggaccess, loadingaccess, ridingaccess = "";
    String loadingreturn, ridingreturn = "";
     
     
    //function data collectors
    String mtostringscope, setscope, getscope, recursionscope = "";
    String mtostringaccess, setaccess, getaccess, recursiveaccess = "";
    String getreturn, recursivereturn = "";
     
     
    //interface data collectors
    String interfaceaccess = "";
    
        
    public void ClassNextButton(ActionEvent event)throws IOException{
        
        Parent win = FXMLLoader.load(getClass().getResource("Finish.fxml"));
//        Scene finishscene = new Scene(win);
//        Stage finishwindow = (Stage)((Node)event.getSource()).getScene().getWindow();
//        finishwindow.setScene(finishscene);
//        finishwindow.show();
        Stage window = new Stage();
        Scene scene = new Scene(win);
        window.setScene(scene);
        window.showAndWait();
        data fhobj = new data();
        fhobj.show();
        fhobj.createClass();

        if(this.constructorbox.isSelected() == true){
            
            constscope = cscopecombo.getValue();
            constaccess = caccesscombo.getValue();
           
            fhobj.appendClasswithconstructor(constaccess);
        }
        if(this.mainbox.isSelected() == true){
            
            fhobj.appendClasswithmain();
        }
        if(this.tostringbox.isSelected() == true){
           
            classtostringscope = tascopecombo.getValue();
            classtostringaccess = taccesscombo.getValue(); 
           
           fhobj.appendClasswithtostring();
           
        }
        
        if(this.instancebox.isSelected() == true){

           instancescope = iscopecombo.getValue();
           instanceaccess = iaccesscombo.getValue();
           instancereturn = ireturncombo.getValue();
           
           fhobj.appendClasswithinstance(instanceaccess, instancescope, instancereturn);
           
        }
        fhobj.createFile();
        
    }
    public void InheritenceNextButton(ActionEvent even)throws IOException{
        Parent win = FXMLLoader.load(getClass().getResource("Finish.fxml"));
        Scene finishscene = new Scene(win);
        Stage finishwindow = (Stage)((Node)even.getSource()).getScene().getWindow();
        finishwindow.setScene(finishscene);
        finishwindow.show();
        
        data fhobj = new data();
        fhobj.createInheritence();
        
        
        if(this.childbox.isSelected() == true){

           childaccess = childaccesscombo.getValue();
           fhobj.appendInheritencewithchild(childaccess);
           
        }
        if(this.aggbox.isSelected() == true && this.childbox.isSelected() == true){

            aggscope = aggascopecombo.getValue();
            aggaccess = aggaccesscombo.getValue();
            fhobj.appendInheritencewithaggregation(aggaccess, aggscope);
        }
        else{
            AlertBox.display("Error","Cannot Perform Aggregation withour Child Class!!!");
        }
        if(this.loadingbox.isSelected() == true && this.childbox.isSelected() == true){

            loadingreturn = loadingreturncombo.getValue();
            loadingreturn2 = loadingreturn2combo.getValue();
            fhobj.appendInheritencewithoverloading(loadingaccess, loadingreturn, loadingreturn2);
        }
        else{
            AlertBox.display("Error","Cannot Perform Overloading withour Child Class!!!");
        }
        if(this.ridingbox.isSelected() == true && this.childbox.isSelected() == true){

            ridingreturn = ridingareturncombo.getValue();
            fhobj.appendInheritencewithoverriding(ridingreturn);
        }
        else{
            AlertBox.display("Error","Cannot Perform Overriding withour Child Class!!!");
        }
        fhobj.createFile();
    }
    
    public void FunctionNextButton(ActionEvent even)throws IOException{
        Parent win = FXMLLoader.load(getClass().getResource("Finish.fxml"));
        Scene finishscene = new Scene(win);
        Stage finishwindow = (Stage)((Node)even.getSource()).getScene().getWindow();
        finishwindow.setScene(finishscene);
        finishwindow.show();
        
        data fhobj = new data();
        fhobj.createFunction();
        
        
        
        if(this.mmainbox.isSelected() == true){
            fhobj.appendFunctionwithmain();

        }
        if(this.tobox.isSelected() == true){
            
            mtostringscope = toscopecombo.getValue();
            mtostringaccess = toaccesscombo.getValue();
            fhobj.appendFunctionwithtostring();
        }
        
        if(this.setbox.isSelected() == true){
            
            setscope = setscopecombo.getValue();
            setaccess = setaccesscombo.getValue();
            fhobj.appendFunctionwithsetter(setaccess, setscope);
        }
        if(this.getbox.isSelected() == true){
            
            getscope = getscopecombo.getValue();
            getaccess = getaccesscombo.getValue();
            getreturn = getreturncombo.getValue();
            fhobj.appendFunctionwithgetter(getaccess, getscope, getreturn);
        }
        if(this.recursionbox.isSelected() == true){
        
            recursionscope = recursivescopecommbo.getValue();
            recursiveaccess = recursiveaccesscommbo.getValue();
            recursivereturn = recursivereturncommbo.getValue();
            fhobj.appendFunctionwithrecursion(recursiveaccess, recursionscope, recursivereturn);
        }
        fhobj.createFile();
        
    }
    
    public void InterfaceNextButton(ActionEvent even)throws IOException{
        Parent win = FXMLLoader.load(getClass().getResource("Finish.fxml"));
        Scene finishscene = new Scene(win);
        Stage finishwindow = (Stage)((Node)even.getSource()).getScene().getWindow();
        finishwindow.setScene(finishscene);
        finishwindow.show();
        
        data fhobj = new data();
        
        
        
        
        if(this.interbox.isSelected() == true){
        
            interfaceaccess = interaccesscombo.getValue();
            fhobj.createInterface(interfaceaccess);
        
        }
        fhobj.createFile();
    }
    
    public void HelloNextButton(ActionEvent even)throws IOException{
        Parent win = FXMLLoader.load(getClass().getResource("Finish.fxml"));
        Scene finishscene = new Scene(win);
        Stage finishwindow = (Stage)((Node)even.getSource()).getScene().getWindow();
        finishwindow.setScene(finishscene);
        finishwindow.show();
        
        data fhobj = new data();
        
        fhobj.createHelloWorld();
        fhobj.createFile();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    cscopecombo.setItems(scopelist);
    caccesscombo.setItems(accesslist);
    iscopecombo.setItems(scopelist);
    iaccesscombo.setItems(accesslist);
    taccesscombo.setItems(accesslist);
    tascopecombo.setItems(scopelist);
    childaccesscombo.setItems(accesslist);
    aggaccesscombo.setItems(accesslist);
    aggascopecombo.setItems(scopelist);
    setscopecombo.setItems(scopelist);
    setaccesscombo.setItems(accesslist);
    getscopecombo.setItems(scopelist);
    getaccesscombo.setItems(accesslist);
    recursivescopecommbo.setItems(scopelist);
    recursiveaccesscommbo.setItems(scopelist);
    interaccesscombo.setItems(accesslist);
    ireturncombo.setItems(returnlist);
    loadingreturncombo.setItems(returnlist);
    ridingareturncombo.setItems(returnlist);
    recursivereturncommbo.setItems(returnlist);
    getreturncombo.setItems(returnlist);
    loadingreturn2combo.setItems(returnlist);
    
    
    }    
    
}
