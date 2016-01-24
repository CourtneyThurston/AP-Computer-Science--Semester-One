
/**
 * GradesV2 takes test scores, adds them together for a point total, and then finds the average score.
 * 
 * @author Courtney Thurston
 * @version 9/17/2013
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {    
        //local variables
        int totalPoints = 0; //total points for all tests
        int numTests = 0; //counts number of tests
        int testGrade = 0; //individual test grade
        double average = 0.0; //average grade
    
        //first grade
        testGrade = 97;
        totalPoints += testGrade;
        numTests ++;
        average = totalPoints / numTests;
        System.out.println("n = 1" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the second grade
        testGrade = 79;
        totalPoints += testGrade;
        numTests ++;
        average = totalPoints / numTests;
        System.out.println("n = 2" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the third grade
        testGrade = 83;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.println("n = 3" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the fourth grade
        testGrade = 88;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.println("n = 4" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the fifth grade
        testGrade = 92;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.println("n = 5" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the sixth grade
        testGrade = 88;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.println("n = 6" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        //adding the seventh grade
        testGrade = 88;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.println("n = 7" + " New test grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    }//end of main method
}//end of class

