package ex46;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            Input input = new Input();
            String string = input.previous();
            Frequency frequency = new Frequency();
            frequency.count(string);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
