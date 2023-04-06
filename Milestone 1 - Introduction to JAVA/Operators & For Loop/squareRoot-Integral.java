/* Square Root (Integral)

Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :

Integer N

Output Format :

Square root of N (integer part only)

Constraints :

0 <= N <= 10^8

Sample Input 1 :

10

Sample Output 1 :

3

Sample Input 2 :

4

Sample Output 2 :

2

------------------------------------------------------------------------*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		double t=0;  
		double sqrtroot=n/2;  
		while((t-sqrtroot)!= 0) {  
		t=sqrtroot;  
		sqrtroot=(t+(n/t))/2;  
		}   
		  
		System.out.println((int)sqrtroot);
	}
}

