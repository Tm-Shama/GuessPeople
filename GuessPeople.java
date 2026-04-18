package driver;

/*
 *  Name - tshama@dmacc,edu
 * CIS171 Tues Afternoon
 * Date:3/3/206
 * Operating System: Windows 11
 * IDE:IntelliJ
 * Program Description:A guessing Game
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Resources used (AI, ChatGPT(for people information)
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessPeople {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Guess People,\n a fun trivia game between you and your computer,\n please type 'quite' when you want to exit the game!\n Have fun:)");
        System.out.println("\nPlease enter your name and age below!");

        System.out.print("Name: ");

        String name = scanner.next();
        System.out.println("Hello " + name + ":)");
        System.out.print("Age: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number ");
            scanner.nextLine();


//While loop to repeat enter user enters a whole number
        }

        int age = scanner.nextInt();
        int computerpoints = 0;

        Player person = new Player(age, "Computer" ,computerpoints,"none");

        System.out.println( "\nPlayer:" + person.getName());
        System.out.println("\nPlease choose your Mystery Person from the list below.");
        String personpicked = people(age,scanner);
        System.out.println("\n" + personpicked);
        /*I will not store the person the user has chosen becuase
          instead I will determine if the computer guessed the person right
          if the user says yes you have gussed correctly to the computer
          if userinput.equals(yes)
             then print(Yay I get a point)
         */
        System.out.println(" Ok, Ready, I get 6 questions to guess your character. ");









    }

    public static String people(int age,Scanner scanner) {
        //use by computer to choice from appropriate
        // group for the person to guess from
        // maybe I can add something that will allow them to add people Ex: them selfs

        String[] genalpha = {"Ryan Kaji", "Blue Ivy", "Salish Matter"};
        String[] genZ = {"Kylian Mbappe", "Zendaya", "Billie Eilish"};
        String[] millennials = {"taylor Swift", "LeBron James", "Rihanna"};
        String[] genX = {"Dwayne Johnson", "Jennifer Lopez", "Elon Musk"};
        String[] boomers = {"Oprah Winfrey", "Barack Obama", "Madonna"};
        String[] silentgen = {"Morgan Freeman", "Dolly Parton", "Anthony Fauci"};

       String person;
       String picked = " ";
        if (age <= 13) {
            System.out.println(Arrays.toString(genalpha )+ "\nPlease type 1, 2 or 3 ");
            person = scanner.next();
            if (person.equals("1")){
                picked = genalpha[0];
            }else if (person.equals("2")){
                picked = genalpha[1];
            }else{
                picked = genalpha[2];
            }
        } else if ((14 <= age) && (age <= 29)) {
            System.out.println(Arrays.toString(genZ )+ "\nPlease type 1, 2 or 3 ");
            person = scanner.next();
            if (person.equals("1")){
                picked = genZ[0];
            }else if (person.equals("2")){
                picked = genZ[1];
            }else{
                picked = genZ[2];
            }
        } else if ((age >= 30) && (age <= 45)) {
            System.out.println(Arrays.toString(millennials)+ "\nPlease type 1, 2 or 3 ");
            person = scanner.next();
            if (person.equals("1")){
                picked = millennials[0];
            }else if (person.equals("2")){
                picked = millennials[1];
            }else{
                picked = millennials[2];
            }
        } else if ((age >= 46) && (age <= 61)) {
            System.out.println(Arrays.toString(genX) + "\nPlease type 1, 2 or 3 " );
            person = scanner.next();
            if (person.equals("1")){
                picked = genX[0];
            }else if (person.equals("2")){
                picked = genX[1];
            }else{
                picked = genX[2];
            }
        } else if ((age >= 62) && (age <= 80)) {
            System.out.println(Arrays.toString(boomers) + "\nPlease type 1, 2 or 3 ");
             person = scanner.next();
            if (person.equals("1")){
                picked = boomers[0];
            }else if (person.equals("2")){
                picked = boomers[1];
            }else{
                picked = boomers[2];
            }
        } else if (age >= 81) {
            System.out.println(Arrays.toString(silentgen) + "\nPlease type 1, 2 or 3 ");
            person = scanner.next();
            if (person.equals("1")){
                picked = silentgen[0];
            }else if (person.equals("2")){
                picked = silentgen[1];
            }else{
                picked = silentgen[2];
            }
        }


        return picked;

    }
























    }
