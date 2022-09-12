/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcg;

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    
    
    public class FileHandling {
        
    String file_name = "";
    String new_file_name = "";
    String DestinationPath = null;
    
    //Source path set by Developer
//    String SourcePath = "D:\\JCG\\TemplateFiles\\";
    
    //Names
    String const_Access = "";
    String aclass_Name = null;
    String aclass_Access = "";
    String aclass_Scope = "";
    
    String bclass_Name = null;
    String bclass_Access = "";
    String bclass_Scope = "";
    
    String cclass_Name = null;
    String cclass_Access = "";
    String cclass_Scope = "";
    
    String amethod_Name = null;
    String amethod_Access = "";
    String amethod_Scope = "";
    String amethod_Type = null;
    
    String var_Access = "";
    String var_Scope = "";
    String var_Type = "";
    String var_Name = null;
    
    String interface_Name = null;
    String interface_Access = "";
    
    String enum_Name = null;
    
    public void setDestinationPath(String Dpath){
        this.DestinationPath = Dpath;
    }
    public void setConstAccess(String access){
        this.const_Access = access;
    }
    public void setACName(String name){
        this.aclass_Name = name;
    }
    public void setACScope(String scope){
        this.aclass_Scope = scope;
    }
    public void setACAccess(String access){
        this.aclass_Access = access;
    } 
    public void setBCName(String name){
        this.bclass_Name = name;
    }
    public void setBCScope(String scope){
        this.bclass_Scope = scope;
    }
    public void setBCAccess(String access){
        this.bclass_Access = access;
    }
    public void setCCName(String name){
        this.cclass_Name = name;
    }
    public void setCCScope(String scope){
        this.cclass_Scope = scope;
    }
    public void setCCAccess(String access){
        this.cclass_Access = access;
    }
    
    public void setAMName(String name){
        this.amethod_Name = name;
    }
    public void setAMType(String type){
        this.amethod_Type = type;
    }
    public void setAMScope(String scope){
        this.amethod_Scope = scope;
    }
    public void setAMAccess(String access){
        this.amethod_Access = access;
    }
    
    
    public void setVar_Access(String access) {
        this.var_Access = access;
    }
    public void setVar_Scope(String scope) {
        this.var_Scope = scope;
    }
    public void setVar_Type(String type) {
        this.var_Type = type;
    }
    public void setVar_Name(String name) {
        this.var_Name = name;
    }
    
    
    public void setEnumName(String name){
        this.enum_Name = name;
    }
    
    public void setInterfaceName(String name){
        this.interface_Name = name;
    }
    public void setInterfaceAccess(String access){
        this.interface_Access = access;
    }
    
    

    public void createHelloWorld(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"HelloWorldTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + "HelloWorld" + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void createEnum(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"EnumTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("enum_name",this.enum_Name);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createClass(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ClassTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createMain(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"MainTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createInterface(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"InterfaceTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("interface_access",this.interface_Access);
            modifiedData = modifiedData.replaceAll("interface_name",this.interface_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.interface_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void createConstrctor(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ConstructorTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("constructor_access",this.const_Access);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void createVariable(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"VariableTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("var_access",this.var_Access);
            modifiedData = modifiedData.replaceAll("var_scope",this.var_Scope);
            modifiedData = modifiedData.replaceAll("var_type",this.var_Type);
            modifiedData = modifiedData.replaceAll("var_name",this.var_Name);
            
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void createMethod(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"MethodTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
            modifiedData = modifiedData.replaceAll("method_scope",this.amethod_Scope);
            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createtoString(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"toStringTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createRecursion(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"RecursionTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
            modifiedData = modifiedData.replaceAll("method_scope",this.amethod_Scope);
            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createLoop(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"LoopingTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createInheritence(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"InheritenceTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createAggregation(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"AggregationTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("bclass_access",this.bclass_Access);
            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createOverriding(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"OverridingTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
            modifiedData = modifiedData.replaceAll("cclass_name",this.cclass_Name);
            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createOverloading(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"OverloadingTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createExceptionHandling(){
    try {
            String fileReader = null;
            String readContent = "";
            
            BufferedWriter writetoFile = null;
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ExceptionHandlingTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            writetoFile = new BufferedWriter(new FileWriter( "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ));
            writetoFile.write(modifiedData);
            writetoFile.close();
            AlertBox.display("Done!", "New File has been Created in Destination Folder.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    
     public void readTemplates() throws IOException{
        
        String sourceFile = "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ;
        BufferedReader read = new BufferedReader(new FileReader(this.DestinationPath + this.file_name));
        String text = null;

        while ((text = read.readLine()) != null) 
        {
        System.out.println(text);
        }
        read.close();
    }
    
    
    
    
    
    
    
}
