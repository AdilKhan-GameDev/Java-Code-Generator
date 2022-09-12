
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HVARZM
 */
public class data {

    static String Destinationpath;
    static  String savedfilename = "Main";
    public String SavedData = "";
    
    
    public static void setpath(String path){
        Destinationpath = path;
    }
    public static void setname(String n){
        savedfilename = n;
    }
    public  String getDestinationpath() {
        
        System.out.println("getdest");
        return Destinationpath;
    }

    public  String getSavedfilename() {
        
        System.out.println("getsaved");
        return savedfilename;
    }
    public void show(){
        System.out.println(this.savedfilename);
        System.out.println(this.Destinationpath);
    }

    
    
    
    public void createClass(){
    try {
        System.out.println(this.Destinationpath);
        System.out.println(this.savedfilename);
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"ClassTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access","public");
            modifiedData = modifiedData.replaceAll("aclass_scope","");
            modifiedData = modifiedData.replaceAll("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        }
    
    public void createHelloWorld(){
    try {
            String fileReader = null;
            String readContent = "";
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"HelloWorldTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            this.SavedData = modifiedData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void appendClasswithmain(){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"MainTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading main
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethismainmethodcomment", readContent1);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendClasswithconstructor(String access){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"ConstructorTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisconstructorcomment", readContent1);
            modifiedData = modifiedData.replace("constructor_access", access);
            modifiedData = modifiedData.replace("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void appendClasswithtostring(){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"toStringTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethistostringcomment", readContent1);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendClasswithinstance(String access, String scope, String returntype){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"VariableTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisinstancecomment", readContent1);
            modifiedData = modifiedData.replaceAll("var_access",access);
            if(scope != "static")
            modifiedData = modifiedData.replaceAll("var_scope","");
            modifiedData = modifiedData.replaceAll("var_scope",scope);
            if(returntype == null || returntype == ""){
            modifiedData = modifiedData.replaceAll("var_type","void");}
            modifiedData = modifiedData.replaceAll("var_type",returntype);
            
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void createInheritence(){
    try {
        System.out.println(this.Destinationpath);
        System.out.println(this.savedfilename);
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"InheritenceTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.savedfilename);
            this.SavedData = this.SavedData + modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        }
    public void appendInheritencewithchild(String access){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"ChildTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisconstructorcomment", readContent1);
            modifiedData = modifiedData.replace("constructor_access", access);
            modifiedData = modifiedData.replace("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendInheritencewithaggregation(String access, String scope){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"AggregationTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisggregationcomment", readContent1);
            modifiedData = modifiedData.replace("agg_access",access);
            if(scope == null || scope == ""){
            modifiedData = modifiedData.replace("agg_scope","");}
            modifiedData = modifiedData.replace("agg_scope",scope);
            modifiedData = modifiedData.replace("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendInheritencewithoverriding(String type){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"AggregationTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisggregationcomment", readContent1);
            if(type == null || type == ""){
            modifiedData = modifiedData.replaceAll("method_type","void");}
            modifiedData = modifiedData.replaceAll("method_type",type);
            modifiedData = modifiedData.replace("method_name",this.savedfilename);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void appendInheritencewithoverloading(String access, String type, String type2){
    try {
            String fileReader = null;
            String readContent1 = "";
            
            BufferedReader readerBuffer1 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"AggregationTemplate.txt" ));
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisggregationcomment", readContent1);
            modifiedData = modifiedData.replaceAll("method_type", access);
            if(type == null || type == ""){
            modifiedData = modifiedData.replaceAll("method_type","void");}
            modifiedData = modifiedData.replaceAll("method_type",type);
            if(type2 == null || type2 == ""){
            modifiedData = modifiedData.replaceAll("method_type2","void");}
            modifiedData = modifiedData.replaceAll("method_type2",type2);
            modifiedData = modifiedData.replace("method_name",this.savedfilename);
            this.SavedData = modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void createFunction(){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"MethodTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        }
    public void appendFunctionwithtostring(){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"toStringTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replaceAll("//ignorethistostringcomment",readContent);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        }
    public void appendFunctionwithsetter(String access, String scope){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"SetterTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replaceAll("//ignorethissettercomment",readContent);
            modifiedData = modifiedData.replaceAll("setter_access", access);
            if(scope == null || scope == ""){
            modifiedData = modifiedData.replaceAll("setter_scope","");}
            modifiedData = modifiedData.replaceAll("setter_scope",scope);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        } 
    public void appendFunctionwithgetter(String access, String scope, String type){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"GetterTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replaceAll("//ignorethisgettercomment",readContent);
            modifiedData = modifiedData.replaceAll("getter_access", access);
            if(scope == null || scope == ""){
            modifiedData = modifiedData.replaceAll("getter_scope","");}
            modifiedData = modifiedData.replaceAll("getter_scope",scope);
            if(type == null || type == ""){
            modifiedData = modifiedData.replaceAll("getter_type","void");}
            modifiedData = modifiedData.replaceAll("getter_type",type);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        } 
    public void appendFunctionwithrecursion(String access, String scope, String type){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"RecursionTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replaceAll("//ignorethisrecursioncomment",readContent);
            modifiedData = modifiedData.replaceAll("method_access", access);
            if(scope == null || scope == ""){
            modifiedData = modifiedData.replaceAll("method_scope","");}
            modifiedData = modifiedData.replaceAll("method_scope",scope);
            if(type == null || type == ""){
            modifiedData = modifiedData.replaceAll("method_type","void");}
            modifiedData = modifiedData.replaceAll("method_type",type);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        } 
    public void appendFunctionwithmain(){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"MainTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replaceAll("//ignorethismaincomment",readContent);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        } 
    public void createInterface(String access){
    try {
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = new BufferedReader( new FileReader( "C:\\Users\\HVARZM\\Desktop\\Java Templates New"+"\\"+"InterfaceTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("interface_access", access);
            modifiedData = modifiedData.replaceAll("aclass_name",this.savedfilename);
            this.SavedData = modifiedData;
		} catch (IOException e) {
        // TODO Auto-generated catch block

		}
        }
    
    
    
    
    
    
    
    
    
    public void createFile() throws IOException{
        
        
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(this.Destinationpath + "\\" + this.savedfilename + ".java"));
        filewriter.write(SavedData);
        filewriter.close();
    }
}
