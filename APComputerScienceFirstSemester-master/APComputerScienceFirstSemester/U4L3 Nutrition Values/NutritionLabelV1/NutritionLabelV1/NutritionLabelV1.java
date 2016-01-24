/**
 
 * The purpose of this program is to print nutrition information from user inputs.
 *
 * @author Courtney Thurston
 * @version 10/11/2013
 */
 
import java.util.Scanner;
 
public class NutritionLabelV1
 
{
    public static void main(String[] args)
 
    {
 
        String foodItem;                            //food item
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyValueFat = 65;                     //fat DRV    
        int dailyValueCarbs = 300;                  //carbohydrates DRV       
        int dailyValueFiber = 25;                   //fiber DRV
        int dailyValueProtein = 50;                 //protein DRV

        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);

        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();

        //serving size
        System.out.println("How many servings will you eat? ");
        int servingSize = in.nextInt();   
        System.out.println();
 
        //calories
        System.out.println("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        System.out.println();

        //fat
        System.out.println("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        totalGramsFat = totalGramsFat * servingSize;
        int percentTotalGramsFat = totalGramsFat * 100 / dailyValueFat;
        boolean isTotalGramsFat = totalGramsFat < dailyValueFat;
        System.out.println();
 
        //carbs
        System.out.print("Enter grams Carbohydrate per serving: ");
        int totalGramsCarbs = in.nextInt();
        totalGramsCarbs = totalGramsCarbs * servingSize;
        int percentTotalGramsCarbs = totalGramsCarbs * 100 / dailyValueCarbs;
        boolean isTotalGramsCarbs = totalGramsCarbs < dailyValueCarbs;
        System.out.println();

        //fiber
        System.out.print("Enter grams Fiber per serving: ");
        int totalGramsFiber = in.nextInt();             
        totalGramsFiber = totalGramsFiber * servingSize;
        int percentTotalGramsFiber = totalGramsFiber * 100 / dailyValueFiber;
        boolean isTotalGramsFiber = totalGramsFiber < dailyValueFiber;
        System.out.println();
        
        //protein
        System.out.print("Enter grams Protein per serving: ");
        int totalGramsProtein = in.nextInt();
        totalGramsProtein = totalGramsProtein * servingSize;
        int percentTotalGramsProtein = totalGramsProtein * 100 / dailyValueProtein;
        boolean isTotalGramsProtein = totalGramsProtein < dailyValueProtein;
        System.out.println();
        
        //output
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        System.out.println();
        System.out.println("Component           Total          Percent          Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Calories              " + totalCalories + "             " + percentTotalCalories + "          " + isTotalCalories);
        System.out.println("Fat:                  " + totalGramsFat + "             " + percentTotalGramsFat + "          " + isTotalGramsFat);
        System.out.println("Carbohydrates:        " + totalGramsCarbs + "             " + percentTotalGramsCarbs + "          " + isTotalGramsCarbs);
        System.out.println("Fiber:                " + totalGramsFiber + "             " + percentTotalGramsFiber + "          " + isTotalGramsFiber);
        System.out.println("Protein:              " + totalGramsProtein + "             " + percentTotalGramsProtein + "          " + isTotalGramsProtein);
    }//end of main method    
 
}//end of class