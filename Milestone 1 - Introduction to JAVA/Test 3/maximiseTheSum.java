/* Maximise the sum
Send Feedback
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :

 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces

Output Format :

Maximum sum value

Constraints :
1 <= M, N <= 10^6
Sample Input :

6
1 5 10 15 20 25
5
2 4 5 9 15

Sample Output :

81

Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
----------------------------------------------------------------------*/

public class Solution {
    public static long maximumSumPath(int[] input1, int[] input2) {
        long sum = 0;
        int sum_x = 0, sum_y = 0;
        int m = input1.length, n = input2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (input1[i] < input2[j]) {
                sum_x += input1[i];
                i++;
            } else if (input2[j] < input1[i]) {
                sum_y += input2[j];
                j++;
            } else {
                sum += Math.max(sum_x, sum_y) + input1[i];
                i++;
                j++;
                sum_x = 0;
                sum_y = 0;
            }
        }
        while (i < m) {
            sum_x += input1[i];
            i++;
        }
        while (j < n) {
            sum_y += input2[j];
            j++;
        }
        sum += Math.max(sum_x, sum_y);
        return sum;
    }
}

