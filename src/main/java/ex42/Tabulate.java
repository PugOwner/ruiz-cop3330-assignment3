/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex42;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tabulate {
    static void namesAndSalary() {
        try {
            File data = new File("src/main/java/ex42/exercise42_input.txt");
            Scanner scanner = new Scanner(data);
            System.out.print("\t Last\t First\t Salary\n");         // Table header
            System.out.print("\t-------------------------\n");      // Table header
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                String[] array = string.split(",");
                System.out.printf("%10s%10s%10s\n", array[0], array[1], array[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}