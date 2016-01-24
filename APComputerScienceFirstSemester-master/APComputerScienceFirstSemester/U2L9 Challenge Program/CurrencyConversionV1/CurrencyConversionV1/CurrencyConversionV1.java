/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another countyr given the current 
 * exchange rate.
 * 
 *
 * ©CSA/FLVS 2007
 * @author Maria Vieta Jacquard
 * @version 01/19/07
 * Edited and developed further by C. Thurston, 9/19/2013
 */
public class CurrencyConversionV1
{   
    public static void main(String [ ] args)
    {
        //Starting variable & peso variables
        double startingUsDollars = 2500.00;      // local variable for US Dollars
        double pesosSpent = 0;             // local variable for Mexican pesos spent
        double totalPesos = 0;                   // local variable for total pesos
        double remainingPesos = 0;               // local variable for pesos remaining after purchases
        double dollarsSpentInMexico = 478.00;             // local variable for dollars spent in Mexico
        //Yen variables
        double yenSpent = 0;             // local variable for Japanese yen spent
        double totalYen = 0;                   // local variable for total yen
        double remainingYen = 0;               // local variable for yen remaining after purchases
        double dollarsSpentInJapan = 824.00;             // local variable for dollars spent in Japan
        //Euro variables
        double eurosSpent = 0;             // local variable for Euros spent
        double totalEuros = 0;                   // local variable for total euros
        double remainingEuros = 0;               // local variable for euros remaining after purchases
        double dollarsSpentInFrance = 1100.00;             // local variable for dollars spent in France
        //Ending variables
        double remainingUsDollars = 0;       // local variable for dollars remaining after all the trips
        
        // purpose of program
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println();
        
        System.out.println("Started with " + startingUsDollars + " dollars.");
        System.out.println();
        
        // convert US dollars to Mexican pesos
        totalPesos = (double)startingUsDollars * 12.70;
        System.out.println(startingUsDollars + " American dollars = " + totalPesos + " Mexican pesos.");
        pesosSpent = (double)dollarsSpentInMexico * 12.70;
        remainingPesos = totalPesos - pesosSpent;
        System.out.println("dollars spent: " + dollarsSpentInMexico + "   pesos spent: " + pesosSpent);
        System.out.println();
        
        // convert Mexican pesos to Japanese yen
        totalYen = (double)remainingPesos * 7.82;
        System.out.println(remainingPesos + " Mexican pesos = " + totalYen + " Japanese yen.");
        yenSpent = (double)dollarsSpentInJapan * 99.31;
        remainingYen = totalYen - yenSpent;
        System.out.println("dollars spent: " + dollarsSpentInJapan + "   Yen spent: " + yenSpent);
        System.out.println();
        
        // convert Japanese yen to Euros
        totalEuros = (double)remainingYen * 0.0074;
        System.out.println(remainingYen + " Japanese yen = " + totalEuros + " Euros.");
        eurosSpent = (double)dollarsSpentInFrance * 0.74;
        remainingEuros = totalEuros - eurosSpent;
        System.out.println("dollars spent: " + dollarsSpentInFrance + "   Euros spent: " + eurosSpent);
        System.out.println();
        
        // convert Euros to US Dollars
        remainingUsDollars = (double)remainingEuros * 1.35;
        System.out.println("Returned with " + remainingEuros + " Euros, or " + remainingUsDollars + " American dollars.");

    } // end of main method
} // end of class