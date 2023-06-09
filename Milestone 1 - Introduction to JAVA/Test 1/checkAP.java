/* Check AP

Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
Input format :

Line 1 : n
Line 2 : n numbers

Sample Input 1 :

6
2 6 10 14 18 22

Sample Output 1 :

true

Sample Input 2 :

6
2 6 10 15 19 23

Sample Output 2 :

false

-------------------------------------------------------------------------*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prev = s.nextInt();
		int progVal = 0, gap = 0;
		int i = 2;
		while (i <= n) {
			int curr = s.nextInt();
			progVal = curr - prev;
			if (gap == 0) {
				gap = progVal;
			}
			if (gap != progVal) {
				System.out.println("false");
				return;
			}
			prev = curr;
			i++;
		}
		System.out.println("true");
	}
}

