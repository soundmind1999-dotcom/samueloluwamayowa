import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine(); 

      
        System.out.print("Enter pizza type (Sapa Size, Small Money, Big Boys, Odogwu): ");
        String pizzaType = input.nextLine().toLowerCase();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        
        switch (pizzaType) {
            case "sapa size":
                slicesPerBox = 4;
                pricePerBox = 2000;
                break;

            case "small money":
                slicesPerBox = 6;
                pricePerBox = 2400;
                break;

            case "big boys":
                slicesPerBox = 8;
                pricePerBox = 3000;
                break;

            case "odogwu":
                slicesPerBox = 12;
                pricePerBox = 4200;
                break;

            default:
                System.out.println("Invalid pizza type!");
                return;
        }

    
        int boxes = (people + slicesPerBox - 1) / slicesPerBox;
        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

       
        System.out.println("\nNumber of boxes of pizza to buy = " + boxes);
        System.out.println("Number of leftover slices = " + leftover);
        System.out.println("Total price = ₦" + totalPrice);

        input.close();
    }
}

