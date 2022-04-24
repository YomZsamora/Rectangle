import models.Rectangle;

import java.io.Console;

public class App {

    public static void main(String[] args) {
        Console myConsole = System.console(); // Reads text from a character-input stream
        System.out.println("Enter the length of your rectangle:"); // Prompts user to enter the length of Rectangle
        String stringLength = myConsole.readLine(); // User inputs the length of rectangle
        int intLength = Integer.parseInt(stringLength); // The user input is then converted to an Integer
        System.out.println("Enter the width of your rectangle:"); // Prompts user to enter the width of Rectangle
        String stringWidth = myConsole.readLine(); // User inputs the width of rectangle
        int intWidth = Integer.parseInt(stringWidth); // // The user input is then converted to an Integer
        Rectangle rectangle = new Rectangle(intLength, intWidth); // // Creates a new instance of Rectangle Class called rectangle
        boolean squareResult = rectangle.isSquare(); // Calls the isSquare() in Rectangle Class responsible for checking if length and width provide make a square
        System.out.println("Is your rectangle a square, too? " + squareResult + "!"); // squareResult is either true or false according to return value of isSquare()
    }
}
