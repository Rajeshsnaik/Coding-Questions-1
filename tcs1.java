/* Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30 */

public class tcs1
{
    static int[] rotate(int nums[], int n, int k) {
        if (k > n)
        k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < k; i++) 
        {
            ans[i] = nums[n - k + i]; //it adds that number at the end of the array
        }

        int index = 0;
        for (int i = k; i < n; i++) 
        {
            ans[i] = nums[index++];//remaining part it fills,starts from 0
        }
    return ans;
}
public static void main(String[] args) {
int Array[] = { 1, 2, 3, 4, 5,6 };
int N = Array.length;
int K = 2;

int[] ans = rotate(Array, N, K);
for (int i = 0; i < N; ++i) {
System.out.print(ans[i]+ " ");
}
}
}