package ex46;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    private String line = "";
    private String previous = "";

    public String previous() throws IOException{
        try {
            File file = new File("src/main/java/ex46/exercise46_input.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine())!=null){
                previous += line;
                previous += " ";
            }
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return previous;
    }
}
