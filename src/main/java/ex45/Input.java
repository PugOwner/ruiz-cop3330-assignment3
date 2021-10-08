package ex45;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    private String line = "";
    private String previous = "";
    private String substituted;

    public String getPrevious() throws IOException{
        try {
            File file = new File("src/main/java/ex45/exercise45_input.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line=bufferedReader.readLine())!=null){
                previous += line+"\r\n";
            }
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return previous;
    }
    public String getSubstituted(String word){
        substituted = previous.replaceAll("utilize",""+word);
        return substituted;
    }
}