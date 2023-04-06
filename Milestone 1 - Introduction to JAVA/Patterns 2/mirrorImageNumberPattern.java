/*Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
      1
     12
    123
   1234

The dots represent spaces.


Input format :

Integer N (Total no. of rows)

Output format :

Pattern in N lines

Constraints

0 <= N <= 50

Sample Input 1:

3

Sample Output 1:

      1 
     12
    123

Sample Input 2:

4

Sample Output 2:

      1 
     12
    123
   1234

---------------------------------------------------------------------*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int spaces = 1;

			while (spaces <= n - i) {

				System.out.print(" ");
				spaces = spaces + 1;
			}
			int num = 1;
			while (num <= i) {
				System.out.print(num);
				num = num + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}

