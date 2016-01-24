/**
 * The purpose of this program is to determine BMR from user inputs.
 *
 * @author Courtney Thurston
 * @version 10/21/2013
 */
 
import java.util.Scanner;

public class BasalMetabolicRate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name;
        String gender;
		char genderLetter;
        int age;
        int height;
        int weight;
        int heightCm;
        int weightKg;
        int BMR;
        boolean isFemale;
        
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println();
 
        System.out.print("Enter your gender, M or F: ");
        gender = in.next();
        System.out.println();
 
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.println();
 
        System.out.print("Enter your height in inches: ");
        height = in.nextInt();
        System.out.println();
 
        System.out.print("Enter your weight in pounds: ");
        weight = in.nextInt();
        System.out.println();
 
        // conversions
        weightKg = (int)(weight * 0.453592);
        heightCm = (int)(height * 2.54);

        genderLetter = gender.charAt(0);
        
        isFemale = genderLetter == 'F';
        
        if (isFemale)
                BMR = (int)(447.593 + (9.247 * weightKg) + (3.098 * heightCm) - (4.330 * age));
        else
                BMR = (int)(88.362 + (13.397 * weightKg) + (4.799 * heightCm) - (5.677 * age));
 
        System.out.println("\n =====================================");
        System.out.println("Name: " + name);
 
        if (isFemale)
                System.out.println("Female");
        else
                System.out.println("Male");
        
        System.out.println("Age: " + age);
        System.out.println("Height in cm: " + heightCm);
        System.out.println("Weight in kg: " + weightKg);
        System.out.print ("Your BMR is " + BMR + " calories per day.");    
    } 
}