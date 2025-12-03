import java.util.Scanner;
public class TimeConverter{
    
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of seconds: ");

        int totalSeconds = input.nextInt();

        int hours = totalSeconds/3600;

        int minutes = totalSeconds * 60;

        int seconds = totalSeconds%60;

        System.out.print("Hours: " + hours);

        System.out.print("Minutes: " + minutes);

        System.out.print("Seconds: " + seconds);



}



}
