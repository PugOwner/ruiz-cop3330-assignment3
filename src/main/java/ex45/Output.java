/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex45;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public void file(String fileName, String substitute) throws IOException{
        try {
            fileName += ".txt";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            byte[] stringToBytes = substitute.getBytes();
            fileOutputStream.write(stringToBytes);
            fileOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}