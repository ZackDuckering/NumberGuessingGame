package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter your first name");
        Scanner input = new Scanner(System.in);
        String firstname = input.next();
        System.out.print("Hello " + firstname);
        System.out.println(", please guess a random number between 1 and 10");
        int numberGuessed = input.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;

        if (numberGuessed == randomNumber)
            System.out.println("Well done you guessed correct!");

        else {
            System.out.println("Incorrect, guess again");


        }





    }
}
