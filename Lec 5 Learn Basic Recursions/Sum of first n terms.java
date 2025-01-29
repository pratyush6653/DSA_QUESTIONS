// Sum of first n terms
// Difficulty: BasicAccuracy: 23.17%Submissions: 171K+Points: 1
// Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

// Examples:

// Input: n = 5
// Output: 225
// Explanation: 13 + 23 + 33 + 43 + 53 = 225
// Input: n = 7
// Output: 784
// Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784
// Constraints:
// 1 <= n <= 200 

class Solution {
    int sumOfSeries(int n) {
        // code here
       return helper(0,1,n);
    }
    private int helper(int sum,int x,int n)
    {
        if(x>n)
        return sum;
        
        sum+=Math.pow(x,3);
        return helper(sum,x+1,n);
    }
}