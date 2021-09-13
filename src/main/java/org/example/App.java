package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "What is the amount?" );
        int amount = input.nextInt();

        System.out.println( "What state do you live in?" );
        String state = input.next();

        // Tax Calculations
        double tax = 0.0;
        double total = amount;

        if (state.equals("Wisconsin")) {
            tax = .05;
            System.out.println( "What county do you live in?" );
            input.nextLine();
            String county = input.nextLine();

            if(!county.equals("Eua Claire") && !county.equals("Dunn")) {
                tax = tax * total;
                total = tax + total;
            }

            if (county.equals("Eau Claire")) {
                tax = .05 + .005;
                tax = tax * total;
                total = tax + total;
            }
            if(county.equals("Dunn")) {
                tax = .05 + .004;
                tax = tax * total;
                total = tax + total;
            }

            System.out.printf("The tax is $%.2f.\n", tax);
        }

        if(state.equals("Illinois")) {
            tax = .08;
            tax = tax * amount;
            total = tax + amount;
            System.out.printf("The tax is $%.2f.\n", tax);
        }

        System.out.printf("The total is $%.2f.", total);


    }
}
