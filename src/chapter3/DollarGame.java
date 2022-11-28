package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]) {

        double penny = 0.05;
        double dime = 0.1;
        double nickel = 0.15;
        double quarter = 0.25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter how many pennies you have:");
        int numberPenny = scanner.nextInt();

        System.out.println("Enter how many dimes you have:");
        int numberDime = scanner.nextInt();

        System.out.println("Enter how many nickels you have:");
        int numberNickel = scanner.nextInt();

        System.out.println("Enter how many quarters you have:");
        int numberQuarter = scanner.nextInt();

        scanner.close();

        double total = (penny * numberPenny) + (dime * numberDime) + (nickel * numberNickel) + (quarter * numberQuarter);


        if (total == dollar) {
            System.out.println("Congrats! You win!");

        } else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you went over " + amountOver);

        } else {
            double amountUnder = dollar - total;
            System.out.println("Sorry, you went under " + amountUnder);
        }

    }
}
