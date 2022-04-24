package models;

public class Rectangle {

    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    } // Getter Method returns the length of an Object

    public int getWidth() {
        return this.width;
    } // Getter Method returns the width of an Object

    public boolean isSquare() {
        // Checks if both length and width are the same. (Squares have the same length and width).
        return length == width;
    }
}
