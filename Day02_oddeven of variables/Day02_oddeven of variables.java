/*
📌TOPIC: Odd or even Numbers
📌QUESTION: Show the number is odd or even integer in java program.
*/
import java.util.*;

public class Conditionsday2 {

    public class oddeven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }
        }

    }

}

/*
📌DESCRIPTION:
A number that is divisible by 2 and generates a remainder of 0 is called an even number. 
All the numbers ending with 0, 2, 4, 6, and 8 are even numbers. 
On the other hand, number that is not divisible by 2 and generates a remainder of 1 is called an odd number. 
All the numbers ending with 1, 3, 5,7, and 9 are odd numbers. 
Do refer to the below illustration to get what is supposed to be conveyed out basics here via generic Illustration for any random integer, check whether it is even or odd. 

📌Methods:

There are various ways to check whether the given number is odd or even. 
Some of them are as follows starting from the brute force approach ending up at the most optimal approach.
Using Brute Force- Naive Approach
Using bitwise operators
Using Bitwise OR
Using Bitwise AND
Using Bitwise XOR
By Checking the Least Significant Bit
