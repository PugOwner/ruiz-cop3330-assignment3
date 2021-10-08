/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex42;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class App {
    static void namesAndSalary() throws IOException {
        // This portion reads the file
        try {
            File data = new File("src/main/java/ex42/exercise42_input.txt");
            Scanner scanner = new Scanner(data);
            System.out.print("\t Last\t First\t Salary\n");
            System.out.print("\t-------------------------\n");
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%10s%10s%10s\n", temp[0], temp[1], temp[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        App.namesAndSalary();
    }
}