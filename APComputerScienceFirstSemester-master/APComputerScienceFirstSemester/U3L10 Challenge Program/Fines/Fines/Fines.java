/**
 * The Fines program accepts user input and calculates fines for overdue books.
 * 
 * ©CSA/FLVS 2007
 * @author C Thurston
 * @version 10/04/13
 */
import java.util.Scanner;
public class Fines
{   
    public static void main(String [ ] args)
    {
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
        String firstToken = in.next();
        String secondToken = in.next();
        String thirdToken = in.nextLine();
        String sentence = firstToken + " " + secondToken + thirdToken;
        System.out.println(" ");
        
        System.out.println("Enter the title of the book: ");
        String bookName = in.nextLine();
        System.out.println(" ");
        System.out.println("Enter the date checked out (mm/dd/yyyy): ");
        String dateChecked = in.nextLine();
        System.out.println(" ");
        System.out.println("Days late: ");
        int daysLate = in.nextInt();
        System.out.println(" ");
        System.out.println("Daily fine: ");
        double dailyFine = in.nextDouble();
        System.out.println(" ");
        
        String firstTokenMod = firstToken.substring(0, firstToken.length() - 1);
        
        String secondTokenMod = secondToken.substring(0, 3);
        String thirdTokenMod = thirdToken.substring(7, 12);
        
        double fine = daysLate * dailyFine;
        
        System.out.print("To: " + firstToken + " " + secondToken + "        ");
        System.out.print("Account: " + firstTokenMod + secondTokenMod + thirdTokenMod);
        System.out.println();
        System.out.println("From: Courtney");
        System.out.println("Subject: Overdue Notice");
        System.out.println("=======================================================");
        System.out.println(bookName + " was checked out on: " + dateChecked);
        System.out.println("This book is currently " + daysLate + " days late.");
        System.out.println("Your fine has accumulated to: " + fine);
    } // end of main method
} // end of class