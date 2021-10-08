package ex45;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public void file(String name, String substitute) throws IOException{
        try {
            name += ".txt";
            FileOutputStream outputStream = new FileOutputStream(name);
            byte[] stringToBytes = substitute.getBytes();

            outputStream.write(stringToBytes);
            outputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
