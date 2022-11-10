/*
📌TOPIC: SUM OF TWO NUMBERS IN JAVA
📌QUESTION: Add two numbers where variable a=10, b=5 in simple java program?
There are two ways to find the sum of two numbers in Java.
To find the sum or addition of two numbers using the method and command-line arguments the sum of three numbers, and the sum of n numbers.
In Java, finding the sum of two or more numbers is very easy. 
First, declare and initialize two variables to be added. Another variable to store the sum of numbers. 
Apply mathematical operator (+) between the declared variable and store the result.
The following program calculates and prints the sum of two numbers.
*/

package Day1;

public class Main {
    public static void main(String[] args) {
        // sum of variables
        int a = 10;
        int b = 5;
        int ans = (a * b) / (a - b);
        System.out.println(ans);
    }
    
}

//📍Another example
import java.util.Scanner;  
public class SumOfNumbers2  
{  
public static void main(String args[])  
{  
int x, y, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
sum = sum(x, y);  
System.out.println("The sum of two numbers x and y is: " + sum);  
}  
//method that calculates the sum  
public static int sum(int a, int b)  
{  
int sum = a + b;  
return sum;  
}  
}  

/*OUTPUT
Enter the first number: 34
Enter the second number: 12
The sum of two numbers x and y is: 46
*/


/*
📌DESCRIPTION:
Sum of Two Numbers in Java Using Method

📍METHODS:
There are two ways to find the sum of two numbers in Java.
By using User-defined Method
By using sum() Method
By Using User-defined Method
The Java Scanner class
allows us to read input from the user. We take two numbers as input and pass them to the user-defined method sum(). 
The following program calculates the sum of two numbers using the method and prints the result.
*/

