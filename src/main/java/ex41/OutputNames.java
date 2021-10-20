/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex41;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputNames {
    public static File outputNames() throws IOException {
        File output = new File("src/main/java/ex41/exercise41_output.txt");
        String[] names = Names.sortNames();

        PrintWriter printWriter = new PrintWriter(output);
        printWriter.println("Total of 7 names");
        printWriter.println("----------------");
        for (String name : names) {
            printWriter.println(name);
        }
        printWriter.close();
        return output;
    }
}