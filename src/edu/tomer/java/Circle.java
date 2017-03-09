package edu.tomer.java;

/**
 * Created by hackeru on 09/03/2017.
 */
//final class - no inheritance
public class Circle {
    private double radius;

    //constructor
    public Circle(double radius) throws Exception {
        setRadius(radius);
    }
    //setter
    public void setRadius(double radius) throws Exception {
        //circle has no (GUI)Graphical User Interface.
        // no way to show the user an alert
        if (radius < 0)
            throw new Exception("Invalid radius " + radius);
        this.radius = radius;
    }
    //getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
