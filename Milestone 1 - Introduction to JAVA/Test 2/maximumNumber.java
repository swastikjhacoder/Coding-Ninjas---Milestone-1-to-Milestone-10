/* Maximum number

We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
Input Format :

A 4 digit number

Output Format :

A 3 digit number

Sample Input :

5438

Sample Output :

548

Explanation :

1. If we remove 5, the new number is 438.
2. If we remove 4, the new number is 538.
3. If we remove 3, the new number is 548.
4. If we remove 8, the new number is 543.
Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548

-----------------------------------------------------------------------------*/

public class Solution {
    
    public static int max_number(int n){
         int n1=n;
		int count=4;
		int max=-1;
		int b=1;
		while(count-->0){
		n1=((n/(10*b)) *b) + n%b;
		max=Math.max(n1,max);
		n1=n;
		b*=10;
		}
		return max;
    }
    

}

