//import java.util.Random;
//
//public class RandomDemo1 {
//    public static void main(String[] args) {
//        Random rand = new Random();
//
//        System.out.println("Random integers between 0 and 9:");
//        for (int i = 0; i < 5; i++) {
//            int number = rand.nextInt(10); // 0 to 9
//            System.out.println(number);
//        }
//    }
//}
//
//
//



//import java.util.Random;
//
//public class RandomDemo {
//
//public static void main (String [] args){
//
//Random rand = new Random();
//
//System.out.println("Five Random Integers between 0 and 9");
//
//for (int count = 0; count < 5; count++){
//    System.out.println(rand.nextInt(10));
//
//}
//
//}
//}




//import java.util.Random;
//
//public class RandomDemo {
//
//public static void main (String [] args){
//
//Random rand = new Random();
//
// a random number between 1 and 6
//int dice = 1 + rand.nextInt(6);
//
//System.out.println(dice);
//
//}
//
//}



//import java.security.SecureRandom;
//public class RandomDemo{
//
//public static void main (String [] args){
// 
//SecureRandom randomNumbers = new SecureRandom();
//
//System.out.print("Four Integers between 0 and 19: ");
//
//for (int count = 0; count < 4; count++){}
//
//System.out.println(randomNumbers.nextInt(20));
//
//}
//
//
//
//}
//
//






//
//import java.util.Random;
//
//public class RandomDemo1 {
//    public static void main(String[] args) {
//        Random rand = new Random();
//
//        System.out.println("Random integers between 1 and :");
//        for (int count = 0; count < 5; count++) {
//            int number = rand.nextInt(10); // 0 to 9
//            System.out.println(number);
//        }
//    }
//}
//





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


}

}







