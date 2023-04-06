/* Multiplication Table
Send Feedback
Write a program to print multiplication table of n
Input Format :

A single integer, n

Output Format :

First 10 multiples of n each printed in new line

Constraints :

0 <= n <= 10,000

Sample Input 1 :

2

Sample Output 1 :

2
4
6
8
10
12
14
16
18
20

Sample Input 2 :

5

Sample Output 2 :

5
10
15
20
25
30
35
40
45
50
--------------------------------------------------------------------------
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		int i = 1, n, res;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (i <= 10) {
			res = n * i;
			System.out.println(res);
			i = i + 1;
		}
	}
}
