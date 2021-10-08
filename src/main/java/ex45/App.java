package ex45;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        String previous = input.getPrevious();
        String sub = input.getSubstituted("use");

        System.out.println("Enter the name for the output file: ");
        String outputFile = scanner.nextLine();

        Output output = new Output();
        output.file(outputFile, sub);
    }
}