/* Rectangular numbers

Print the following pattern for the given number of rows.
Pattern for N = 4

4444444
4333334
4322234
4321234
4322234
4333334  
4444444

Input format : N (Total no. of rows)

Output format : Pattern in N lines
Sample Input :

3

Sample Output :

33333
32223
32123
32223
33333

----------------------------------------------------------------------*/


public class solution {

	public static void print(int n) {
		int length = 2 * n - 1; 
        int first = 0;
        int second = length - 1;
        int pat[][] = new int[length][length];
        while (n != 0) {
            for (int i = first; i <= second; i++) {
                for (int j = first; j <= second; j++) {
                    if (i == first || i == second || j == first || j == second)
                    	pat[i][j] = n;
                }
            }
            ++first;
            --second;
            --n;
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(pat[i][j]);
            }
            System.out.println();
        }
	}

}

