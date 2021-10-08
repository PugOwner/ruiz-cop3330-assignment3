/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex41;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Names {
    public static String[] sortNames() throws IOException {
        File file = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner scanner = new Scanner(file);
        String[]  names = new String[7];
        int i = 0;

        while(scanner.hasNextLine()){
            names[i] = scanner.nextLine();
            i++;
        }
        Arrays.sort(names);
        return names;
    }
}