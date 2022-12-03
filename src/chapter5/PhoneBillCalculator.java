package chapter5;

import java.util.Scanner;

/*
Allow the user to input the plan fee and the number of overage minutes.
And then you're going to charge 25 cents for every minute that they've gone over,
and then a 15% tax on the subtotal.
 */
public class PhoneBillCalculator {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        double overageCharge = calculateOverage(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
        scanner.close();
    }

    public static double calculateOverage(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal) {
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax) {
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));

    }


}
