/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 * 
 *      Sample Calculation:
 *        1 mile = 5280 ft, therefore    6230 ft / 5280 = 1.7992 miles
 *                      
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 * 
 * Modified by: Courtney Thurston
 * Date: 9/15/2013
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {    
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        //...finish declaring local variables here, including end of line 
        //...comments doccumenting purpose of each variable
       
        
        //convert feet to miles
        feet = 6230;
        miles = feet / 5280;
        System.out.println(feet + " ft. = " + miles + " mi.");
        
        
        //convert miles to feet
        miles = 58.7;
        feet = miles * 5280;
        System.out.println(miles + " miles = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 59.3;
        kilometers = miles * 1.609;
        System.out.println(miles + " miles = " + kilometers + " kilometers.");
        
        
        //convert kilometers to miles
        kilometers = 2.7;
        miles = kilometers * 0.6214;
        System.out.println(kilometers + " kilometers = " + miles + " miles.");
       
        //convert pounds to kilograms
        pounds = 192.78;
        kilograms = pounds * 0.453;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms.");
        
        //convert kilograms to pounds
        kilograms = 129.2;
        pounds = kilograms * 2.205;
        System.out.println(kilograms + " kilograms = " + pounds + " pounds.");
        
    }//end of main method
}//end of class
