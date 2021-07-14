/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex32;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    //Easy difficulty
    public static void choiceOne() {

        Random rand = new Random();
        int max = 10;
        int min = 1;
        int guessCount = 0;

        int randomNum = rand.nextInt(max - min + 1) + min;

        Scanner choice = new Scanner(System.in);

        boolean done = false;

        System.out.println("");
        System.out.print("I have my number. Whats your guess? ");

        int input = choice.nextInt();

        while(!done) {

            if(input > randomNum) {

                System.out.print("You guessed too high. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input < randomNum) {

                System.out.print("You guessed too low. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input == randomNum) {

                System.out.print("You guessed correctly! You got it in " + (guessCount + 1) + " guesses.");
                done = true;

            }

        }

    }

    //Medium difficulty
    public static void choiceTwo() {

        Random rand = new Random();
        int max = 100;
        int min = 1;
        int guessCount = 0;

        int randomNum = rand.nextInt(max - min + 1) + min;

        Scanner choice = new Scanner(System.in);

        boolean done = false;

        System.out.println("");
        System.out.print("I have my number. Whats your guess? ");

        int input = choice.nextInt();

        while(!done) {

            if(input > randomNum) {

                System.out.print("You guessed too high. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input < randomNum) {

                System.out.print("You guessed too low. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input == randomNum) {

                System.out.print("You guessed correctly! You got it in " + (guessCount + 1) + " guesses.");
                done = true;

            }

        }

    }

    //Hard difficulty
    public static void choiceThree() {

        Random rand = new Random();
        int max = 1000;
        int min = 1;
        int guessCount = 0;

        int randomNum = rand.nextInt(max - min + 1) + min;

        Scanner choice = new Scanner(System.in);

        boolean done = false;

        System.out.println("");
        System.out.print("I have my number. Whats your guess? ");

        int input = choice.nextInt();

        while(!done) {

            if(input > randomNum) {

                System.out.print("You guessed too high. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input < randomNum) {

                System.out.print("You guessed too low. Guess again? ");
                input = choice.nextInt();

                guessCount++;

            }

            else if(input == randomNum) {

                System.out.print("You guessed correctly! You got it in " + (guessCount + 1) + " guesses.");
                done = true;

            }

        }

    }

    //Lets user play again
    public static void playAgain() {

        String c;
        String yes = "Y";
        String no = "N";

        Scanner in = new Scanner(System.in);

        System.out.println("");
        System.out.print("Would you like to play again (Y/N): ");
        c = in.nextLine();

        if(c.equalsIgnoreCase(yes)) {

            String userChoice;

            System.out.print("Lets play a guessing game!\n");
            System.out.println("");

            Scanner choice = new Scanner(System.in);

            boolean done = false;

            while(!done) {

                System.out.print("Enter the difficulty level (1, 2 or 3): ");
                String input = choice.nextLine();

                switch (input) {

                    case "1":

                        System.out.println("");
                        System.out.print("You chose easy difficulty");
                        System.out.println("");

                        choiceOne();

                        done = true;
                        break;

                    case "2":

                        System.out.println("");
                        System.out.print("You chose medium difficulty");
                        System.out.println("");

                        choiceTwo();

                        done = true;
                        break;

                    case "3":

                        System.out.println("");
                        System.out.print("You chose hard difficulty");
                        System.out.println("");

                        choiceThree();

                        done = true;
                        break;

                    default:

                        System.out.println("");
                        System.out.print("Error\n");
                        System.out.println("");

                }

            }

        }

        if(c.equalsIgnoreCase(no)) {

            System.out.print("Have a nice day!");

        }

    }

    public static void main(String[] args) {

        String userChoice;

        System.out.print("Lets play a guessing game!\n");
        System.out.println("");

        Scanner choice = new Scanner(System.in);

        boolean done = false;

        while(!done) {

            System.out.print("Enter the difficulty level (1, 2 or 3): ");
            String input = choice.nextLine();

            switch (input) {

                case "1":

                    System.out.println("");
                    System.out.print("You chose easy difficulty");
                    System.out.println("");

                    choiceOne();
                    playAgain();

                    done = true;
                    break;

                case "2":

                    System.out.println("");
                    System.out.print("You chose medium difficulty");
                    System.out.println("");

                    choiceTwo();
                    playAgain();

                    done = true;
                    break;

                case "3":

                    System.out.println("");
                    System.out.print("You chose hard difficulty");
                    System.out.println("");

                    choiceThree();
                    playAgain();

                    done = true;
                    break;

                default:

                    System.out.println("");
                    System.out.print("Error\n");
                    System.out.println("");

            }

        }

    }


}
