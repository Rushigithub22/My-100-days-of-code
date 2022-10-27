//You are given  queries in the form of , q , and . For each query, print the series corresponding to the given ,a ,b and n values as a single line of n space-separated integers.

import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // Java Loops II - Hacker Rank Solution Java START
            for (int j = 0; j < n; j++) 
            {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
            // Java Loops II - Hacker Rank Solution Java END
        }
        in.close();
    }
}
