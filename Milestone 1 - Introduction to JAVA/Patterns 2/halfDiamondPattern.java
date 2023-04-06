/* Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :

A single integer: N

Output Format :

Required Pattern

Constraints :

0 <= N <= 50

Sample Input 1 :

3

Sample Output 1 :

*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2 :

 5

Sample Output 2 :

*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

-----------------------------------------------------------------------*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        System.out.println('*');
        while (i <= n) {
            System.out.print('*');
            int num = 1;
            while (num <= i) {
                // System.out.print('*');
                System.out.print(num);
                num = num + 1;
            }
            int dec = i - 1;
            while (dec >= 1) {
                System.out.print(dec);
                // System.out.print('*');
                dec = dec - 1;
            }
            System.out.print('*');
            System.out.println();
            i = i + 1;
        }
        int j = n - 1;
        while (j >= 1) {
            System.out.print('*');
            int num = 1;
            while (num <= j) {
                System.out.print(num);
                num = num + 1;
            }
            int dec = j - 1;
            while (dec >= 1) {
                System.out.print(dec);
                dec = dec - 1;
            }
            System.out.print('*');
            System.out.println();
            j = j - 1;
        }
        System.out.println('*');
    }
}
