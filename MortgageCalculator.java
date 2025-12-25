import java.util.Scanner;

public class MortgageCalculator{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan duration (years): ");
        int years = input.nextInt();

        double monthlyRate = annualRate / (100 * 12);
        int months = years * 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.printf("Monthly Mortgage Payment: %.2f%n", monthlyPayment);

        input.close();
    }
}

