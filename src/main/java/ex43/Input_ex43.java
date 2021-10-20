/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex43;
import java.util.Scanner;

public class Input_ex43 {
    private String author;
    private String site;
    private char JS = 'N';
    private char CSS = 'N';
    Scanner scanner = new Scanner(System.in);
    // Takes user input to create file/folder
    public String getName(){
        System.out.println("Site name: ");
        String site = scanner.nextLine();
        return site;
    }
    public String getAuthor(){
        System.out.println("Author name: ");
        String author = scanner.next();
        return author;
    }
    public char jsFile(){
        System.out.println("Do you want a folder for JavaScript? ");
        JS = scanner.next().charAt(0);
        return JS;
    }
    public char cssFile(){
        System.out.println("Do you want a folder for CSS? ");
        CSS = scanner.next().charAt(0);
        return CSS;
    }
}