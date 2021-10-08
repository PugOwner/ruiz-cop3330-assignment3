/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex41;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class App {
    static void sortNames() throws IOException {
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner scanner = new Scanner(file);
        String[] names = new String[7];
        int i = 0;

        while(scanner.hasNextLine()){
            names[i] = scanner.nextLine();
            i++;
        }
        Arrays.sort(names);

        File output = new File("src/main/java/ex41/exercise41_output.txt");
        output.createNewFile();

        PrintWriter printWriter = new PrintWriter(output);
        printWriter.println("Total of 7 names");
        printWriter.println("----------------");
        for (int j = 0; j < names.length; j++){
            printWriter.println(names[j]);
        }
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        App.sortNames();
    }
}
