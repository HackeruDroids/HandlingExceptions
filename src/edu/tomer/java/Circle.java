package edu.tomer.java;

/**
 * Created by hackeru on 09/03/2017.
 */
//final class - no inheritance
public class Circle {
    private double radius;

    //constructor
    public Circle(double radius)  {
        setRadius(radius);
    }


    //setter
    public void setRadius(double radius)  {
        //circle has no (GUI)Graphical User Interface.
        // no way to show the user an alert
        if (radius < 0) {
            throw new RadiusException(radius + "");
        }

        this.radius = radius;
    }
    //getArea
    public double getArea() {
        return Math.PI * radius * radius;
    }


    private class RadiusException extends RuntimeException {
        public RadiusException() {

        }

        public RadiusException(String message) {
            super(message);
        }
    }
}
