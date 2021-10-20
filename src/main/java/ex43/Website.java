/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Ruiz
 */
package ex43;

public class Website {
    public static void generate(){
        String name;
        String author;
        char JS = 'N';
        char CSS = 'N';
        Input_ex43 input_ex43 = new Input_ex43();
        name = input_ex43.getName();
        author = input_ex43.getAuthor();
        JS = input_ex43.jsFile();
        CSS = input_ex43.cssFile();
        directory(name,author,JS,CSS);
    }
    public static void directory(String name, String author, char JS, char CSS){
        Directory directory = new Directory();
        directory.setPath(name,author,JS,CSS);
        directory.fileAndFolders(name,author,JS,CSS);
    }
}