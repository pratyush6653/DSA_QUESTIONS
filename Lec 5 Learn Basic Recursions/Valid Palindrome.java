// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.


class Solution {
    String word="";
    public boolean isPalindrome(String s) {
        if(s.length()==0)
        return false;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        System.out.println(s);
       String x=valid(s.length()-1,s);
       System.out.println(x);
       if(x.equals(s))
       return true;
       return false;
    }
    
    public String valid(int end, String s)
    {
        if(end>=0)
        {
        word+=s.charAt(end);
        valid(end-1,s);
        }
        return word;
    }
}