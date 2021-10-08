/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex46;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            Input input = new Input();              // Input objet
            String string = input.previous();       // String is assigned object
            Frequency frequency = new Frequency();  // Frequency object created
            frequency.count(string);                // count method takes string value
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
