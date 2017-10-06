//*****************************************************************************
//PlusTest.java
//
//Demonstrate the different behaviors of the + operator
//*****************************************************************************
import java.util.Scanner;

public class PlusTest {
    public static void main (String[] args) {
        System.out.println("This is a long string that is the " 
                            + "concentration of two shorter strings.");
        System.out.println("The first computer was inventer about" + 55 +
                            "years ago.");
        System.out.println("8 plus 5 is " + 8 + 5);
        System.out.println("8 plus 5 is " + (8 + 5));
        System.out.println(8 + 5 + " equals 8 plus 5.");
    }
}
    