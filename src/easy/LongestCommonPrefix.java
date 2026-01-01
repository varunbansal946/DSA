package easy;
//14. Longest Common Prefix
//        Easy
//
//Topics
//premium lock icon
//        Companies
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters if it is non-empty.

import java.util.Arrays;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(strs));
//
//
//        strs= new String[]{"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(strs));

        strs= new String []{"abab","aba",""};
        System.out.println(longestCommonPrefix(strs));




    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";

        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            int max= Math.min(result.length(), strs[i].length());

            while ((j<max)&&(strs[i].charAt(j) == result.charAt(j))  ) {
                ++j;
            }

            result = result.substring(0, j);

            if (result.isEmpty()) {
                return "";
            }
        }


        return result;
    }
}
