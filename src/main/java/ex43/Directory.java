/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex43;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directory{
    private String Path;
    boolean createSite;

    public  void setPath(String site, String author, char JS, char CSS){
        Path = System.getProperty("user.dir");
        Path += "\\"+ site;
        File website = new File(Path);          // File created
        createSite = website.mkdir();           // Checks if directory was created
    }
    public void fileAndFolders(String name, String author, char JS, char CSS){
        System.out.println("Created "+Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(Path+"\\index.html");       // Creates index.html file
            bufferedWriter = new BufferedWriter(fileWriter);                // Used to write in index.html file

            bufferedWriter.write("<!DOCTYPE html>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<html>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<title>AwesomeCO</title>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t</head>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<body>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<h1>This is a heading</h1>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<p>This is a paragraph.</p>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t</body>");
            bufferedWriter.newLine();
            bufferedWriter.write ("\t<html>");
            bufferedWriter.close();

            if (JS == 'y'||JS == 'Y'){                                      // Creating JS directory
                File JS_Directory = new File(Path+"\\js");
                boolean js_Directory = JS_Directory.mkdir();

                if (js_Directory){
                    System.out.println("Created "+ JS_Directory +"\\");
                }
                else {
                    System.out.println("JS folder was not created.");
                }
            }
            if (CSS == 'y'||JS == 'Y'){                                     // Creates CSS directory
                File CSS_Folder = new File(Path+"\\css");
                boolean CSS_Created = CSS_Folder.mkdir();
                if (CSS_Created){
                    System.out.println("Created "+ CSS_Folder +"\\");
                }
                else {
                    System.out.println("CSS folder was not created.");
                }
            }
        }
        catch (IOException e) {
            System.out.println("index.html not created");
        }
    }
}