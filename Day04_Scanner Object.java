
//The code above creates a Scanner object named Scanner and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is: 
//In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
//sample input values 42, 100, 125: //sample output values 42, 100, 125
import java.util.*;

public class Day4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        // Complete this line
        // Complete this line
        System.out.println(b);
        System.out.println(c);
    }
}
