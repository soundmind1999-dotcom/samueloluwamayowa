import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any word: ");
        String text = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int index = 0; index < text.length(); index++) {

            char ch = text.charAt(index);

          
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels += 1;
                } else {
                    consonants += 1;
                }
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

    }
}
