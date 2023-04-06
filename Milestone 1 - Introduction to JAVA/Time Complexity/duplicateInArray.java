/* Duplicate in array

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :

Duplicate number is always present in the given array/list.

Input format :

The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :

For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.

Constraints :

1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec

Sample Input 1:

1
9
0 7 2 5 4 7 1 3 6

Sample Output 1:

7

Sample Input 2:

2
5
0 2 1 3 1
7
0 3 1 5 4 3 2

Sample Output 2:

1
3

-----------------------------------------------------------------------------*/

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
	public static int findDuplicate(int[] arr) {
		int n = arr.length;
		mergeSort(arr, 0, n - 1);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + 1])
				return arr[i];
		}
		return Integer.MIN_VALUE;
	}
}
