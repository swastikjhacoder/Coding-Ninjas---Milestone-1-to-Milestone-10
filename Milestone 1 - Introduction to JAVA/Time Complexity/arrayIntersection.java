/* Array Intersection

You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :

Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in ascending order.


Input format :

The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output format :

For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.

Constraints :

1 <= t <= 10^2
0 <= N <= 10^6
0 <= M <= 10^6

Time Limit: 1 sec 

Sample Input 1 :

2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10

Sample Output 1 :

2 3 4
10

Sample Input 2 :

1
4
2 6 1 2
5
1 2 3 4 2

Sample Output 2 :

1 2 2

Explanation for Sample Output 2 :

Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.

----------------------------------------------------------------------------*/

public class Solution {
public static void merge(int array[], int p, int q, int r) {
	    int n1 = q - p + 1;
	    int n2 = r - q;
	    int L[] = new int[n1];
	    int M[] = new int[n2];
	    for (int i = 0; i < n1; i++)
	      L[i] = array[p + i];
	    for (int j = 0; j < n2; j++)
	      M[j] = array[q + 1 + j];
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = p;
	    while (i < n1 && j < n2) {
	      if (L[i] <= M[j]) {
	        array[k] = L[i];
	        i++;
	      } else {
	        array[k] = M[j];
	        j++;
	      }
	      k++;
	    }
	    while (i < n1) {
	      array[k] = L[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      array[k] = M[j];
	      j++;
	      k++;
	    }
	  }

	public static void mergeSort(int array[], int left, int right) {
	    if (left < right) {
	      int mid = (left + right) / 2;
	      mergeSort(array, left, mid);
	      mergeSort(array, mid + 1, right);
	      merge(array, left, mid, right);
	    }
	  }

	public static void intersection(int[] arr1, int[] arr2) {
	    int n = arr1.length;
     	int m = arr2.length;
     	
     	mergeSort(arr1,0,n-1);
     	mergeSort(arr2,0,m-1);
        
     	int i = 0, j = 0;
     	while (i < n && j < m) {
            if (arr1[i] < arr2[j])
               i++;
            else if (arr2[j] < arr1[i])
               j++;
            else {
               System.out.print(arr2[j++]+" ");
               i++; 
            }
         }
	}

}
