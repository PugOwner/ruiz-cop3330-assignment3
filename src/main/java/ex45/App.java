/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex45;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        String previous = input.getOriginalWord();
        String substitute = input.getSubstitute("use");

        System.out.println("Enter the name for the output file: ");
        String outputFile = scanner.nextLine();

        Output output = new Output();

        output.file(outputFile, substitute);
    }
}