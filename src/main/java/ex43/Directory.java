package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directory{
    private String Path;
    boolean createSite;


    public  void setPath(String name, String author, char JS, char CSS){
        Path = System.getProperty("user.dir");                              // Change name?
        Path += "\\"+name;
        File website = new File(Path);                                      // Create file using path. '.getProperty'
        createSite=website.mkdir();
    }
    public void files(String name, String author, char JS, char CSS){
        System.out.println("Created "+Path);

        try{
            FileWriter fileWriter = new FileWriter(String.valueOf(new FileWriter(Path+"\\index.html")));
            fileWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            fileWriter.write("\t<meta author=\""+author+"\">\n");
            fileWriter.write("\t<title>"+name+"</title>\n");
            fileWriter.write("</head>\n<body>\n\n</body>\n</html>");
            fileWriter.close();

            System.out.println("Created "+Path+"\\index.html");
            // Creating JS folder
            if (JS == 'y'||JS == 'Y'){
                File JS_Folder = new File(Path+"\\js");
                boolean JS_Created = JS_Folder.mkdir();

                if (JS_Created){
                    System.out.println("Created "+JS_Folder+"\\");
                }
                else {
                    System.out.println("JS folder not created.");
                }
            }
            if (CSS == 'y'||JS == 'Y'){
                File CSS_Folder = new File(Path+"\\css");
                boolean CSS_Created = CSS_Folder.mkdir();
                if (CSS_Created){
                    System.out.println("Created "+ CSS_Folder +"\\");
                }
                else {
                    System.out.println("CSS folder not created.");
                }
            }
        }
        catch (IOException e) {
            System.out.println("index.html not created");
        }
    }
}


