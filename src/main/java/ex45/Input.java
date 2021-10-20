/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex45;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    private String line = "";
    private String originalWord = "";
    private String substitute;

    public String getOriginalWord() throws IOException{
        try {
            File file = new File("src/main/java/ex45/exercise45_input.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line=bufferedReader.readLine())!=null){
                originalWord += line+"\r\n";
            }
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return originalWord;
    }
    public String getSubstitute(String word){
        substitute = originalWord.replaceAll("utilize",""+word);
        return substitute;
    }
}