package medium;

//Longest Palindromic Substring
//        Medium
//
//Topics
//premium lock icon
//        Companies
//
//Hint
//Given a string s, return the longest palindromic substring in s.
//
//
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//        Example 2:
//
//Input: s = "cbbd"
//Output: "bb"


public class LongestPalindrome {


    public static void main(String [] args)
    {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));

    }

    public static String longestPalindrome(String s) {

        if(s.length()<=1)
            return s;

        String lps="";

        for(int i=1;i<s.length();i++)
        {

//            considering odd length palindrome
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                --low;
                ++high;

                if(low==-1||high==s.length())
                    break;
            }

            String palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length())
                lps=palindrome;


            //            considering even length palindrome
             low=i-1;
             high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                --low;
                ++high;

                if(low==-1||high==s.length())
                    break;
            }

             palindrome=s.substring(low+1,high);
            if(palindrome.length()>lps.length())
                lps=palindrome;

        }

        return lps;
    }
}
