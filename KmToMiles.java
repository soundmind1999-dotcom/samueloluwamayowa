import java.util.Scanner;
public class KmToMiles{
    
    public static void main (String [] args){


    Scanner input = new Scanner(System.in);

    System.out.println("Enter distance in kilometres: ");

    double kilometres = input.nextDouble();

    double miles = kilometres * 0.601371;

    System.out.print(kilometres + "km is equal to" + miles + "miles: %n");



} 





}
