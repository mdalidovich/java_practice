package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main (String args[]){

        //Ask to name a season of the year
        System.out.println("Enter the name of the season:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Ask the number of cups of coffee
        System.out.println("Enter the whole number:");
        int number = scanner.nextInt();

        //Ask to name an adjective
        System.out.println("Enter the adjective to describe the season of the year:");
        String adjective = scanner.next();
        scanner.close();

        //Display result
        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
