/**
 * The purpose of this program is to determine a target heart rate range from user inputs.
 *
 * @author Courtney Thurston
 * @version 10/13/2013
 */
 
import java.util.Scanner;
 
public class TargetZone
 
{
    public static void main(String[] args)
 
    {
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);

        System.out.println("Determine Your Target Heart Rate Zone for Cariovascular Exercise (50% - 85%)");
        
        //serving size
        System.out.println("Enter your age: ");
        int age = in.nextInt();   
        System.out.println();
        
        System.out.println("Enter your resting heart rate: ");
        int restingRate = in.nextInt();   
        System.out.println();
        
        System.out.println("Enter your heart rate after exercising: ");
        int afterRate = in.nextInt();   
        System.out.println();
        
        int maxRate = 220 - age;
        int reserveRate = maxRate - restingRate;
        double highEnd = (reserveRate * .85) + restingRate;
        double lowEnd = (reserveRate * .50) + restingRate;
        System.out.println("Your heart rate target zone is between " + lowEnd + " and " + highEnd);
        
            if (lowEnd <= afterRate){
                if (afterRate <= highEnd ){
                    System.out.println("After just exercising, your heart rate is within your target zone.");

                }//end of main method    
            }
    }
}//end of class