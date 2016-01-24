
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 03/08/07
 */
public class TextMessage
{
    public static void main(String[ ] args)
    {
       //determine the length of the String object called odString
       String oldString = "How are you? See you later tonight, be back later!";
       
       //replace characters within the String object
       String replaceCharacters = oldString.replace("are", "R");
       replaceCharacters = replaceCharacters.replace("you", "U");
       replaceCharacters = replaceCharacters.replace("See", "C");
       replaceCharacters = replaceCharacters.replace("be back later", "BBL");
       replaceCharacters = replaceCharacters.replace("tonight", "2nite");
       System.out.println("Original text message: " + oldString);
       int oldStringLength = oldString.length();
       System.out.println("Old text message length: " + oldStringLength);
       System.out.println();
       System.out.println("Replacement text message: " + replaceCharacters);
       int newStringLength = replaceCharacters.length();
       System.out.println("New text message length: " + newStringLength);
    }//end of main method
}//end of class
