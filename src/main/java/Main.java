/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.println();
        System.out.println("Hello, "+name+", nice to meet you!");
    }
}
