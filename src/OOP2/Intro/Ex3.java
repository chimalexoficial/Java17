package OOP2.Intro;

import java.awt.*;

// Defining a Point class to represent a point in 2-dimensional space
public class Ex3 {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Ex3(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        // Your code here
        double subX = this.x - other.x;
        double subY = this.y - other.y;
        double value = ((subX * subX) + (subY * subY));
        return Math.sqrt(value);
    }
}