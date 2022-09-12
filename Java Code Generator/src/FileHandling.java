/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    
    
    public class FileHandling {
        
    String file_name = "";
    private String new_file_name = "Main";
    private String  DestinationPath = null;
    
    
    public String SavedData = "";
    
    data pbj = new data();
    
    public void datacollected(){
        new_file_name = pbj.getSavedfilename();
        DestinationPath = pbj.getDestinationpath();
        System.out.println(this.new_file_name);
        System.out.println(this.DestinationPath);
    }    
//    public void setNew_file_name(String new_file_name) {
//        this.new_file_name = new_file_name;
//        System.out.println(this.new_file_name);
//
//    }
//
    public void setDestinationPath(String DestinationPath) {
        this.DestinationPath = DestinationPath;
        System.out.println(this.new_file_name);
    }

    public void createFile() throws IOException{
        
        System.out.println(this.DestinationPath);
        System.out.println(this.new_file_name);
        BufferedWriter filewriter = null;
        filewriter = new BufferedWriter(new FileWriter("C:\\Users\\HVARZM\\Desktop\\" + this.new_file_name + ".java"));
        
        
    }

    
    public void createHelloWorld(){
    try {
            String fileReader = null;
            String readContent = "";
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"HelloWorldTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            this.SavedData = this.SavedData + modifiedData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }

    public void createClass(){
    try {
        System.out.println(this.DestinationPath);
        System.out.println(this.new_file_name);
        String fileReader = null;
            String readContent = "";
            
            BufferedReader readerBuffer = null;
            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ClassTemplate.txt" ));
            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
                readContent = readContent + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent;
            modifiedData = modifiedData.replaceAll("aclass_access","public");
            modifiedData = modifiedData.replaceAll("aclass_scope","");
            this.SavedData = this.SavedData + modifiedData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void appendClasswithmain(){
    try {
            String fileReader = null;
            String readContent1 = "";
            String readContent2 = "";
            
            BufferedReader readerBuffer1 = null;
            BufferedReader readerBuffer2 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"MainTemplate.txt" ));
//            readerBuffer2 = new BufferedReader( new FileReader( this.SavedData ));
//            
//            while (( fileReader = readerBuffer2.readLine()) != null ) { // reading class
//                readContent2 = readContent2 + fileReader + "\n";
//                }
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading main
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethismainmethodcomment", readContent1);
            this.SavedData = this.SavedData + modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendClasswithconstructor(String access){
    try {
            String fileReader = null;
            String readContent1 = "";
            String readContent2 = "";
            
            BufferedReader readerBuffer1 = null;
            BufferedReader readerBuffer2 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ConstructorTemplate.txt" ));
//            readerBuffer2 = new BufferedReader( new FileReader( this.SavedData ));
//
//            while (( fileReader = readerBuffer2.readLine()) != null ) { // reading class
//                readContent2 = readContent2 + fileReader + "\n";
//                }
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethisconstructorcomment", readContent1);
            modifiedData = modifiedData.replace("constructor_access", access);
            this.SavedData = this.SavedData + modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    public void appendClasswithtostring(){
    try {
            String fileReader = null;
            String readContent1 = "";
            String readContent2 = "";
            
            BufferedReader readerBuffer1 = null;
            BufferedReader readerBuffer2 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"toStringTemplate.txt" ));
//            readerBuffer2 = new BufferedReader( new FileReader( this.SavedData ));
//
//            while (( fileReader = readerBuffer2.readLine()) != null ) { // reading class
//                readContent2 = readContent2 + fileReader + "\n";
//                }
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = this.SavedData;
            modifiedData = modifiedData.replace("//ignorethistostringcomment", readContent1);
            this.SavedData = this.SavedData + modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    public void appendClasswithinstance(String access, String scope, String returntype){
    try {
            String fileReader = null;
            String readContent1 = "";
            String readContent2 = "";
            
            BufferedReader readerBuffer1 = null;
            BufferedReader readerBuffer2 = null;
            readerBuffer1 = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"VariableTemplate.txt" ));
            readerBuffer2 = new BufferedReader( new FileReader( this.SavedData ));

            while (( fileReader = readerBuffer2.readLine()) != null ) { // reading class
                readContent2 = readContent2 + fileReader + "\n";
                }
            fileReader = null;
            while (( fileReader = readerBuffer1.readLine()) != null ) { // reading constructor
                readContent1 = readContent1 + fileReader + "\n";
                }
            //Appending File
            String modifiedData;
            modifiedData = readContent2;
            modifiedData = modifiedData.replace("//ignorethisinstancecomment", readContent1);
            modifiedData = modifiedData.replaceAll("var_access",access);
            modifiedData = modifiedData.replaceAll("var_scope",scope);
            if(returntype == null || returntype == ""){
            modifiedData = modifiedData.replaceAll("var_type","void");}
            modifiedData = modifiedData.replaceAll("var_type",returntype);
            
            this.SavedData = this.SavedData + modifiedData;
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
                    e.printStackTrace();
		}
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void createInterface(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"InterfaceTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("interface_access",this.interface_Access);
//            modifiedData = modifiedData.replaceAll("interface_name",this.interface_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    public void createConstrctor(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ConstructorTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("constructor_access",this.const_Access);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    public void createVariable(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"VariableTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("var_access",this.var_Access);
//            modifiedData = modifiedData.replaceAll("var_scope",this.var_Scope);
//            modifiedData = modifiedData.replaceAll("var_type",this.var_Type);
//            modifiedData = modifiedData.replaceAll("var_name",this.var_Name);
//            this.SavedData = this.SavedData + modifiedData;
//            
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    public void createMethod(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"MethodTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
//            modifiedData = modifiedData.replaceAll("method_scope",this.amethod_Scope);
//            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
//            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createtoString(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"toStringTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createRecursion(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"RecursionTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_scope",this.aclass_Scope);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
//            modifiedData = modifiedData.replaceAll("method_scope",this.amethod_Scope);
//            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
//            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createLoop(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"LoopingTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createInheritence(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"InheritenceTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createAggregation(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"AggregationTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_access",this.aclass_Access);
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("bclass_access",this.bclass_Access);
//            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createOverriding(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"OverridingTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("bclass_name",this.bclass_Name);
//            modifiedData = modifiedData.replaceAll("cclass_name",this.cclass_Name);
//            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
//            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createOverloading(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"OverloadingTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            modifiedData = modifiedData.replaceAll("aclass_name",this.aclass_Name);
//            modifiedData = modifiedData.replaceAll("method_type",this.amethod_Type);
//            modifiedData = modifiedData.replaceAll("method_name",this.amethod_Name);
//            modifiedData = modifiedData.replaceAll("method_access",this.amethod_Access);
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    public void createExceptionHandling(){
//    try {
//            String fileReader = null;
//            String readContent = "";
//            
//            BufferedReader readerBuffer = null;
//            readerBuffer = new BufferedReader( new FileReader( "D:/JCG/TemplateFiles"+"/"+"ExceptionHandlingTemplate.txt" ));
//            while (( fileReader = readerBuffer.readLine()) != null ) { // read a line
//                readContent = readContent + fileReader + "\n";
//                }
//            //Appending File
//            String modifiedData;
//            modifiedData = readContent;
//            this.SavedData = this.SavedData + modifiedData;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//                    e.printStackTrace();
//		}
//        }
//    
//    
//     public void readTemplates() throws IOException{
//        
//        String sourceFile = "C:\\Users\\HVARZM\\Desktop\\" + this.aclass_Name + ".java" ;
//        BufferedReader read = new BufferedReader(new FileReader(this.DestinationPath + this.file_name));
//        String text = null;
//
//        while ((text = read.readLine()) != null) 
//        {
//        System.out.println(text);
//        }
//        read.close();
//    }
    
    
    
    
    
    
    
}
