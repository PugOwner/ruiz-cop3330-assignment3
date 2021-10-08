package ex43;
/*
*           App Class
* Main method calls for input function
* App get user input and creates directory using class Input and Directory
*
*
* */

public class App {
    public static void main(String[] args){
        String author;
        String name;
        char JS = 'N';
        char CSS = 'N';
        // Creating objects
        Directory directory = new Directory();
        Input input = new Input();
        // Function calls
        name = input.getName();
        author = input.getAuthor();
        JS = input.jsFile();
        CSS = input.cssFile();
        directory.setPath(name,author,JS,CSS);
        directory.files(name,author,JS,CSS);
    }
}
