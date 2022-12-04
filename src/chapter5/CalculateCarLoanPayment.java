package chapter5;

import java.util.Scanner;

public class CalculateCarLoanPayment {
    static Scanner scanner = new Scanner(System.in);
    static int minSalary = 75000;
    static int minScore = 700;

    public static void main(String args[]) {

        int salary = getSalary();
        int score = getScore();

        boolean qualified = isQualified(salary, score);
        notifyUser(qualified);

        int price = getCarPrice();
        int payment = getDownPayment();

        scanner.close();
        int monthlyPayment = calculateLoan(price, payment);
        boolean decision = isAccepted(monthlyPayment);
        isAgreed(decision);
    }

    public static int getSalary() {
        System.out.println("Enter your yearly salary:");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getScore() {
        System.out.println("Enter your current credit score:");
        int score = scanner.nextInt();
        return score;
    }

    public static boolean isQualified(int salary, int score) {
        if (salary >= minSalary && score >= minScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You are eligible for a loan!");
        } else {
            System.out.println("Sorry, you are not eligible for a loan.");
        }
    }

    public static int getCarPrice(){
        System.out.println("Enter the car price:");
        int price = scanner.nextInt();
        return price;
    }

    public static int getDownPayment(){
        System.out.println("Enter the down payment:");
        int downPayment = scanner.nextInt();
        return downPayment;
    }

    public static int calculateLoan(int price, int downPayment){
        int loanTerm = 60;
        int monthlyPayment = (price - downPayment) / loanTerm;
        System.out.println("Your monthly car loan payment is $" + monthlyPayment);
        return monthlyPayment;
    }

    public static boolean isAccepted(int monthlyPayment ){
        if(monthlyPayment <= 500){
            return true;
        } else {
            return false;
        }
    }

    public static void isAgreed(boolean confirmed){
        if(confirmed){
            System.out.println("Car loan is taken");
        }else {
            System.out.println("Proposed car loan is declined by customer");
        }
    }

}
