/**
 * This program calculates BMI given user inputs!
 * 
 * @author Courtney Thurston
 * @version 10/21/2013
 */
import java.util.Scanner;

public class BodyMassIndex
{
    public static void main( String[] args )
    {
        //Variables
        String name;
        int weight;
        int feet;
        int inches;
        
        Scanner in = new Scanner(System.in);
        
        //Prompt user to enter stats
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println();

        System.out.println("Enter weight in pounds: ");
        weight = in.nextInt();
        
        System.out.println("Enter feet and inches: ");
        feet = in.nextInt();
        inches = in.nextInt();
        
        //Computation
        double weightKg = (int)(weight * 0.453592)*100;
        double heightInch = (int)(feet * 12) + inches;
        double heightM = (int)(heightInch * 0.254);
        double BMI = weightKg / (heightM * heightM);
        
        //Result
        System.out.println("\n =====================================");
        System.out.println("Name: " + name);
        System.out.println("Height in m: " + heightM);
        System.out.println("Weight in kg: " + weightKg);
        System.out.println("Your BMI is: ");
        System.out.printf("%.2f", BMI);
        
        if (BMI < 16)
            System.out.println("\nYou are very underweight!");
        else if (BMI < 18)
            System.out.println("\nYou are underweight!");
        else if (BMI < 24)
            System.out.println("\nYou are normal weight!");
        else if (BMI < 29)
            System.out.println("\nYou are overweight!");
        else if (BMI < 35)
            System.out.println("\nYou are obese!");
   }
}
