
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * Commonwealth Connections Academy 
 * @author Courtney Thurston
 * @version 5 09/13/i2013
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        int i0 = -2;
        double d1 = 0.5;
        int i2 = 2;
        double d3 = 2.5;
        int i4 = 3;
        double d5 = 3.14;
        int i6 = 4;
        int i7 = 5;
        int i8 = 6;
        int i9 = 8;
        double d10 = 8.9325;
        int i11 = 9;
        int i12 = 10;
        int i13 = 11;
        int i14 = 12;
        int i15 = 15;
        int i16 = 17;
        int i17 = 20;
        int i18 = 23;
        double d19 = 23.51;
        int i20 = 24;
        int i21 = 32;
        int i22 = 33;
        double d23 = 46.2;
        double d24 = 47.0038;
        int i25 = 48;
        double d26 = 98.6;
        int i27 = 200;
        int i28 = 201;
        int i29 = 212;
        int i30 = 234;
        double d31 = 243.1;
        int i32 = 480;
        double d33 = 3298.7;

        System.out.println(i15 + " divided by " + d3 + " times " + i0 + " plus " + i12 + "/ " + i7 + " equals..." + (i15 / d3 * i0 + i12 / i7)); 
        System.out.println();
        System.out.println(i30 + " minus " + "(" + "i30" + " divided by " + i8 + " modulus " + i14 + ") " + i4 + " equals..." + (i30 - (i30 / i8 % i14) + i4)); 
        System.out.println();
        System.out.println("(" + d23 + " divided by " + i13 +") minus " + i4 + " plus " + i20 + " modulus (" + i16 + " minus " + i2 + " times " + i4 + ") equals..." + ((d23 / i13) - i4 + i20 % (i16 - i2 * i4))); 
        System.out.println();
        System.out.println(480 + " divided by " + 10 + " divided by " + 12 + " plus " + 200 + "*"+ .5 + " minus " + 20 + " modulus " + 8 + " equals..." + ((480 / 10 / 12 + 200 *.5 - 20 % 8))); 
        System.out.println();
        // Addition
        System.out.println("Addition");
        System.out.println(i6 + " plus " + i9 + " equals " + (i6 + i9)); 
        System.out.println();
        System.out.println(d19 + " plus " + d10 + " equals " + (d19 + d10)); 
        System.out.println();
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(i11 + " minus " + i22 + " equals " + (i11 - i22)); 
        System.out.println();
        System.out.println(d26 + " minus " + d24 + " equals " + (d26 - d24)); 
        System.out.println();
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(i15 + " times " + i4 + " times " + i28 + " equals " + (i15 * i4 * i28)); 
        System.out.println();
        System.out.println(d5 + " times " + i7 + " times " + i7 + " equals " + (d5 * i7 * i7)); 
        System.out.println();
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(i25 + " divided by " + i9 + " equals " + (i25 / i9)); 
        System.out.println();
        System.out.println(i29 + " divided by " + i21 + " equals " + (i29 / i21)); 
        System.out.println();
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(i18 + " modulus " + i15 + " equals " + (i18 % i15)); 
        System.out.println();
        System.out.println(d33 + " modulus " + d31 + " equals " + (d33 % d31)); 
        System.out.println();
        //System.out.println();
               
    } // end of main method
} // end of class