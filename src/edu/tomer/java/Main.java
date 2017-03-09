package edu.tomer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = scan.nextDouble();

        //let's handle the exception
        Circle c = new Circle(r);
    }
}
