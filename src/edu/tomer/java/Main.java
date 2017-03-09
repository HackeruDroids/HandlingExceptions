package edu.tomer.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        try {
//            Circle c = new Circle(-2);
//        }
//        catch (Exception e){
//            throw new RuntimeException("Crystal clear message", e);
//        }

        //getInputStream

        //http://w...
        //convert a  string to url

        //Checked Exceptions - extend Exception - Must Handle or try{}catch{}
        URLConnection con = null;
        try {
            URL url = new URL("https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html");
            //open a connection
            con = url.openConnection();
            InputStream in = con.getInputStream();
            System.out.println("Yay");
            int x = Integer.parseInt("Hello");
            //multi-catch
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {

            }
        }

    }

    public static int getInt(String message) {
        Scanner scan = new Scanner(System.in);

        int number;
        while (true) {
            try {
                System.out.println(message);
                String input = scan.nextLine();
                number = Integer.valueOf(input);
                return number;
            } catch (NumberFormatException e) {
                //recursion
//            return getInt("Try again!");
                message = "Try Again";
            }
        }
    }
}
