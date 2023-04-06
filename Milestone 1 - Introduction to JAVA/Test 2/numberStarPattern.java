/* Number Star Pattern
Send Feedback
Print the following pattern for given number of rows.

Input format :

Line 1 : N (Total number of rows)
Sample Input :

   5

Sample Output :

1234554321
1234**4321
123****321
12******21
1********1

-------------------------------------------------------------------------*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = n;
		while (i >= 1) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j = j + 1;
			}
			int k = n;
			while (k > i) {
				System.out.print('*');
				k = k - 1;
			}

			int l = n;
			while (l > i) {
				System.out.print('*');
				l = l - 1;
			}
			int m = i;
			while (m >= 1) {
				System.out.print(m);
				m = m - 1;
			}
			System.out.println();
			i = i - 1;
		}
	}
}

