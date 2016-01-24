/**
 * This program converts a text message to
 * the given user input.
 * 
 * ©FLVS 2007
 * @author C. Thurston
 * @version 10/02/13
 */
import java.util.Scanner;
public class TextMessageV2
{
    public static void main(String[ ] args)
    {
       Scanner in;
       in = new Scanner(System.in);
       
       String oldString = "How are you? See you later tonight, be back later!";
       System.out.println(oldString);
       
       //replace characters within the String object
       //use the next() method to enter a word
       System.out.print("What word or letter would you like to replace 'are' with in the above sentence?  ");
	   String areWord = in.next();
       String replaceCharacters = oldString.replace("are", areWord);
       System.out.print("What word or letter would you like to replace 'you' with in the above sentence?  ");
	   String youWord = in.next();
       replaceCharacters = replaceCharacters.replace("you", youWord);
       System.out.print("What word or letter would you like to replace 'see' with in the above sentence?  ");
	   String seeWord = in.next();
       replaceCharacters = replaceCharacters.replace("See", seeWord);
       System.out.print("What would you like to replace 'be back later' with in the above sentence?  ");
	   String bblWord = in.next();
       replaceCharacters = replaceCharacters.replace("be back later", bblWord);
       System.out.print("What word or letter would you like to replace 'tonight' with in the above sentence?  ");
	   String tonightWord = in.next();
       replaceCharacters = replaceCharacters.replace("tonight", tonightWord);
       System.out.println("Original text message: " + oldString);
       int oldStringLength = oldString.length();
       System.out.println("Old text message length: " + oldStringLength);
       System.out.println();
       System.out.println("Replacement text message: " + replaceCharacters);
       int newStringLength = replaceCharacters.length();
       System.out.println("New text message length: " + newStringLength);
    }//end of main method
}//end of class