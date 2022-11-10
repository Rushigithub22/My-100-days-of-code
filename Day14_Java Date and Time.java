//Topic: 
//Java Date and Time
//Question: 
//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
// You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

//Example:

//month = 8
//day = 14
//year = 2017
//The method should return MONDAY as the day on that date.

//Function Description

//Complete the findDay function in the editor below.

//findDay has the following parameters:

//int: month
//int: day
//int: year

//Returns

//string: the day of the week in capital letters

//Input Format

//A single line of input containing the space-separated month, day and year, respectively, in MM DD YYYY format.



//Constraints

//2000 < year < 3000

//Sample Input:

//08 05 2015

//Sample Output:

//WEDNESDAY

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class JavaDateAndTime {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    
    public static String getDay(String day, String month, String year) {
          
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
          
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d); 
            
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
    }
}
