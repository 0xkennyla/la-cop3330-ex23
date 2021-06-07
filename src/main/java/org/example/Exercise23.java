/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        String input1 = scan.next();
        switch (input1){
            case "yes":
                System.out.println("Are the battery terminals corroded?");
                String userInput1 = scan.next();
                if(userInput1.equalsIgnoreCase("yes"))
                    System.out.println("Clean terminals and try starting again.");
                else
                    System.out.println("Replace cables and try again.");
                break;
            case "no":
                System.out.println("Does the car make a slicking noise?");
                String userInput2 = scan.next();
                if (userInput2.equalsIgnoreCase("yes"))
                    System.out.println("Replace the battery");
                else {
                    System.out.println("Does the car crank up but fail to start?");
                    String userInput3 = scan.next();
                    if (userInput3.equalsIgnoreCase("yes"))
                        System.out.println("Check spark plug connections.");
                    else
                        System.out.println("Does the engine start and then die?");
                    String userInput4 = scan.next();
                    if (userInput4.equalsIgnoreCase("yes")) {
                        System.out.println("Does your car have fuel injection?");
                        String userInput5 = scan.next();
                        if (userInput5.equalsIgnoreCase("yes"))
                            System.out.println("Get it in for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.println("This should not be possible.");
                }
        }
    }
}