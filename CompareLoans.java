import java.util.Scanner;

public class CompareLoans {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("\nInterest Rate\tMonthly Payment\tTotal Payment");


        for (double rate = 5.0; rate <= 10.0; rate += 0.25) {

            double monthlyInterestRate = rate / 100 / 12;
            int numberOfMonths = numberOfYears * 12;

            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths));

            double totalPayment = monthlyPayment * numberOfMonths;

            System.out.printf("%.3f%%\t\t%.2f\t\t%.2f\n", rate, monthlyPayment, totalPayment);
        }

    }
}
