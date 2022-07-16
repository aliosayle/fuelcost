import java.util.Scanner;

public class cost 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Kilometers: ");
        Double distance = scan.nextDouble();
        Double lpkm = 12.0 / 100.0; // litres per km
        Double litres = (lpkm * distance);
        Double fuel = (distance * liters);
        Double price = (32500.0);
        Double cost = (fuel * price);
        System.out.println("The cost is: " + cost);
    }
}
