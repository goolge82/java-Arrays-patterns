package com.Arrays;

import java.util.Scanner;
import java.util.Random;

public class GuessRandom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter the starting range:");
        int n1 = sc.nextInt();

        System.out.println("Enter the ending range:");
        int n2 = sc.nextInt();

        if (n1 >= n2) {
            System.out.println("Invalid range!");
            sc.close();
            return;
        }

        int randomNumber = r.nextInt(n2 - n1 + 1) + n1;

        for (int i = 0; i < 6; i++) {

            System.out.println("Guess the number:");
            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct guess!");
                break;
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }

            if (i == 5) {
                System.out.println("Game over!");
                System.out.println("The number was: " + randomNumber);
            }
        }

        sc.close();
    }
}
