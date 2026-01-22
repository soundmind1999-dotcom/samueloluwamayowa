import java.util.Scanner;
import java.util.Random;

public class TaskOne1 {

public static void main (String [] args){

Random rand = new Random();
Scanner input = new Scanner(System.in);

System.out.println("Guess the random number between 1 and 20: ");
int randomNumber = input.nextInt();

// a random number between 1 and 20

int number = 1 + rand.nextInt(20);

System.out.println(number);

if (randomNumber == number){
System.out.println("You are correct");

}

else 
    System.out.println("You are wrong");
    System.out.println("Correct answer is: " + number);



}

}
